package com.smartfile.api;

public class SmartFileException extends Exception {
    private int status = 0;

    public SmartFileException(String error, int status) {
        super(error);
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getMessage();
    }

    public int getStatus() {
        return this.status;
    }
}