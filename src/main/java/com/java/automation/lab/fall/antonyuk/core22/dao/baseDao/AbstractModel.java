package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import java.io.Serializable;

public class AbstractModel implements Serializable {

    protected int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
