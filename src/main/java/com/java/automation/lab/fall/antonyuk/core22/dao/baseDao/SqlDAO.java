package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import com.java.automation.lab.fall.antonyuk.core22.cheker.ReturnTypeValidator;
import com.java.automation.lab.fall.antonyuk.core22.connection.ConnectionPool;

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
        System.out.println(pattern);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(pattern);
        resultSet.next();
        counter = resultSet.getInt(1) + 1;
        System.out.println(counter);
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
        try {
            StringBuffer fieldsName = new StringBuffer();
            StringBuffer fieldsValue = new StringBuffer();
            fieldsName.append("(");
            fieldsValue.append("(");
            Field[] fields = value.getClass().getDeclaredFields();
            for (Field f: fields) {
                f.setAccessible(true);
                if (ReturnTypeValidator.isNecessaryQuotes(f.getAnnotatedType().toString())){
                    fieldsValue.append("'" + f.get(value) + "',");
                    fieldsName.append(f.getName() + ",");
                }
                else {
                    fieldsName.append(f.getName() + ",");
                    fieldsValue.append(f.get(value) + ",");
                }
            }
            fieldsName.append("id)");
            fieldsValue.append(counter + ")");
            counter++;
            String sqlQuery = "insert into " + tableName + fieldsName.toString()
                    + " values" + fieldsValue.toString();
            System.out.println(sqlQuery);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlQuery);
        } catch (IllegalAccessException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setName(String name) {
        this.tableName = name;
    }
}
