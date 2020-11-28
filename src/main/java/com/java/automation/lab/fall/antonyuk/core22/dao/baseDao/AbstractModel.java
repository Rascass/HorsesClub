package com.java.automation.lab.fall.antonyuk.core22.dao.baseDao;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "AbstractModel")
@XmlType(propOrder = {"id"})
public class AbstractModel implements Serializable {

    protected int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
