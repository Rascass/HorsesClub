package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import com.java.automation.lab.fall.antonyuk.core22.connection.ConnectionPool;

import javax.naming.NamingException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class SqlDAO<T extends AbstractModel> implements Daoable<T>{

    private String tableName;
    private Connection connection;
    private final int MAX_COUNT = 4;

    public SqlDAO() throws SQLException, InterruptedException {
        ConnectionPool connectionPool = new ConnectionPool(MAX_COUNT);
        this.connection = connectionPool.retrieve();
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
