package com.efe;

public class TeacherCreditManager extends BaseCreditManager {
    @Override
    public double calculate(double cost){
        return cost * 1.15;
    }
}
