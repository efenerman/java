package com.efe;

public class StudentCreditManager extends BaseCreditManager{
    @Override
    public double calculate(double cost){
        return cost * 1.10;
    }
}
