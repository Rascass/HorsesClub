package com.java.automation.lab.fall.antonyuk.core22.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class SessionFactory {

    public static final Logger LOGGER = LoggerFactory.getLogger(SessionFactory.class);

    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            String resource = "mybatis-config.xml";
            Reader is  = Resources.getResourceAsReader(resource);
            System.out.println(is);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            LOGGER.info("success");
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }
}