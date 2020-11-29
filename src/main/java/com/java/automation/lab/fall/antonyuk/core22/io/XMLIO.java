package com.java.automation.lab.fall.antonyuk.core22.io;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.AbstractModel;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XMLIO<T extends AbstractModel> {
    private Class<T> clasz;
    public XMLIO(Class<T> clasz) {
        this.clasz = clasz;
    }
    @SuppressWarnings(value = "uncheked")
    public T read(String path) throws JAXBException {
        T obj = null;
        JAXBContext context = JAXBContext.newInstance(clasz);
        return (T) context.createUnmarshaller().unmarshal(new File(path).getAbsoluteFile());
    }

    public void write(T obj, String path) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(obj, new File(path).getAbsoluteFile());
    }
}
