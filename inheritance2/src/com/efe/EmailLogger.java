package com.efe;

public class EmailLogger extends Logger {
    @Override
    public void log(){
        System.out.println("Email is sent");
    }
}
