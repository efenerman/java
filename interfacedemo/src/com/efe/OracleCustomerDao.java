package com.efe;

public class OracleCustomerDao implements ICustomerDao,IRepository{
    @Override
    public void add() {
        System.out.println("Customer is added to Oracle Database");
    }
}
