package com.efe;

public class CustomerManager{
   private ICustomerDao customerDao;

    public CustomerManager(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void add(){
        //business codes
        customerDao.add();
    }
}
