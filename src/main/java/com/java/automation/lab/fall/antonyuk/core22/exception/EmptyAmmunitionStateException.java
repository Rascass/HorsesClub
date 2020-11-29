package com.java.automation.lab.fall.antonyuk.core22.exception;

public class EmptyAmmunitionStateException extends Exception{

    public EmptyAmmunitionStateException() {
        super("State of ammunition is null!");
    }
}
