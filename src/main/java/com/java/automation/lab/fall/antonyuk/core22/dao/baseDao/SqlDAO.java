package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import com.java.automation.lab.fall.antonyuk.core22.config.SessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.*;

public class SqlDAO<T extends AbstractModel> implements Daoable<T> {

    private String tableName;

    public SqlDAO(String name) {
        this.tableName = name;
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
    public void update(T t) {
        SqlSession sqlSession = SessionFactory.getSession();
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
    public T create(T value) {
        SqlSession sqlSession = SessionFactory.getSession();
        sqlSession.insert(tableName + "_mapper" + ".create", value);
        sqlSession.commit();
        List<AbstractModel> values = sqlSession.selectList(tableName + "_mapper" + ".getAll");
        int id = 0;
        if (values.size() > 0) {
            id = values.get(values.size() - 1).getId();
        }
        value.setId(id);
        sqlSession.close();
        return value;
    }

    @Override
    public void setName(String name) {
        this.tableName = name;
    }
}
