package com.java.automation.lab.fall.antonyuk.core22.runner;

import com.java.automation.lab.fall.antonyuk.core22.dao.baseDao.FileDAO;
import com.java.automation.lab.fall.antonyuk.core22.dao.daoModel.AddressDAO;
import com.java.automation.lab.fall.antonyuk.core22.domain.club.Address;

import javax.naming.InvalidNameException;

public class Main {
    public static void main(String[] args) throws InvalidNameException {
        AddressDAO dao = AddressDAO.getInstance(new FileDAO<Address>(), "addresses");
        dao.create(new Address("Minsk", "Minsk", "Odincova", 1));
    }
}
