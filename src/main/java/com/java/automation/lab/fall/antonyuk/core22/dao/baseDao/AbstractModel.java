package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.*;

@XmlRootElement(name = "AbstractModel")
@XmlType(propOrder = {"id"})
public class AbstractModel implements Serializable {

    protected Integer id;

    public AbstractModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
