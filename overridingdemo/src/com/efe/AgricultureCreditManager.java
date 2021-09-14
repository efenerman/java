package com.efe;

public class AgricultureCreditManager extends BaseCreditManager{
    @Override
    public double calculate(double cost){
        return cost * 1.05;
    }
}
