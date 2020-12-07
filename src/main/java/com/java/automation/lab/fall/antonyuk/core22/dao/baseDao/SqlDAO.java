package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import com.java.automation.lab.fall.antonyuk.core22.cheker.ReturnTypeValidator;
import com.java.automation.lab.fall.antonyuk.core22.config.SessionFactory;
import com.java.automation.lab.fall.antonyuk.core22.connection.ConnectionPool;
import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class SqlDAO<T extends AbstractModel> implements Daoable<T>{

    private String tableName;
    private Connection connection;
    private final int MAX_COUNT = 4;
    private int counter = 0;

    public SqlDAO(String name) throws SQLException, InterruptedException {
        this.tableName = name;
        ConnectionPool connectionPool = new ConnectionPool(MAX_COUNT);
        this.connection = connectionPool.retrieve();
        String pattern = "select max(id) as id from " + tableName;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(pattern);
        resultSet.next();
        counter = resultSet.getInt(1) + 1;
    }

    @Override
    public T get(int id) {
        SqlSession sqlSession = SessionFactory.getSession();
        T a = sqlSession.selectOne(tableName + "_mapper" + ".get", id);
        sqlSession.close();
        return a;
    }

    @Override
    public List<T> getAll() {
        SqlSession sqlSession = SessionFactory.getSession();
        List<T> values = sqlSession.selectList(tableName + "_mapper" + ".getAll");
        sqlSession.close();
        return values;
    }

    @Override
    public void update(Integer id, T t) {
        SqlSession sqlSession = SessionFactory.getSession();
        t.setId(id);
        sqlSession.insert(tableName + "_mapper" + ".update", t);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.delete(tableName + "_mapper" + ".delete", id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void create(T value) {
        SqlSession sqlSession = SessionFactory.getSession();
        value.setId(counter++);
        sqlSession.insert(tableName + "_mapper" + ".create", value);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void setName(String name) {
        this.tableName = name;
    }
}
