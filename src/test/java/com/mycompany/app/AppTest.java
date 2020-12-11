package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import com.java.automation.lab.fall.antonyuk.core22.domain.person.Veterinar;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.InvalidNameException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws InvalidNameException {
        Logger logger = LoggerFactory.getLogger(Veterinar.class);
        assertTrue(true);
    }
}
