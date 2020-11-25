package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import com.java.automation.lab.fall.antonyuk.core22.constant.DBConstant;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class SqlDAO<T extends AbstractModel> implements Daoable<T>{

    private String tableName;
    private Connection connection;

    public SqlDAO() throws SQLException,
            ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        this.connection = DriverManager.getConnection(DBConstant.URL, DBConstant.USERNAME, DBConstant.PASSWORD);
    }

    @Override
    public T get(int id) {
        String pattern = "select * from " + tableName +  " where id = " + id;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(pattern);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map<Integer, T> getAll() {
        String pattern = "select * from " + tableName;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(pattern);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(int id, T t) {
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public void create(T value) {
    }

    @Override
    public void setName(String name) {
        tableName = name;
    }
}
