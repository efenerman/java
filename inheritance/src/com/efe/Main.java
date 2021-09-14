package com.efe;

public class Main {

    public static void main(String[] args) {
        IndividualCustomer efe=new IndividualCustomer();
    efe.customerNumber="12345";

    CorporateCustomer hepsiBurada=new CorporateCustomer();
	hepsiBurada.customerNumber="78910";

	Union union=new Union();
	union.customerNumber="99999";

	CustomerManager customerManager=new CustomerManager();

	Customer customers[]={efe,union,hepsiBurada};
	customerManager.addMultiple(customers);



    }
}
