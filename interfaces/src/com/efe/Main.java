package com.efe;

public class Main {

    public static void main(String[] args) {
    	Logger loggers[]={new SmsLogger(),new EmailLogger(),new FileLogger(),new DatabaseLogger()};
	CustomerManager customerManager=new CustomerManager(loggers);
	Customer efe=new Customer(1,"Efe","Nerman");
	customerManager.add(efe);
	//Customer customers[]={new Customer(1,"George","Clooney"),new Customer(2,"Tom","Hanks")};
	//customerManager.addMultipleCustomer(customers);
    }
}
