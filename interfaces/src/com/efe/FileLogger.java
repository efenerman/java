package com.efe;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Dosya loglandı: " + message);
    }
}