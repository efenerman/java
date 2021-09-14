package com.efe;

public class MySqlCustomerDao implements ICustomerDao,IRepository{
    @Override
    public void add() {
        System.out.println("Customer is added to MYSQL Database");
    }
}
