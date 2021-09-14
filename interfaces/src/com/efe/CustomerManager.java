package com.efe;
//DatabaseLogger logger=new DatabaseLogger(); //tightly coupled bad code
//logger.log(customer.getFirstName() + " veri tabanı loglandı..");
public class CustomerManager {
    private Logger loggers[];

    public CustomerManager(Logger loggers[]) {
        this.loggers = loggers;
    }

    //loosly coupled
    public void add(Customer customer) {
        System.out.println("Customer is added " + customer.getFirstName() + " " + customer.getLastName());
        Utils.runLoggers(loggers, customer.getFirstName()+" "+customer.getLastName());
    }
    public void delete(Customer customer){
        System.out.println("Customer is removed " + customer.getFirstName()+" "+customer.getLastName());
        Utils.runLoggers(loggers, customer.getFirstName()+" "+customer.getLastName());
        //this.logger.log(customer.getFirstName()+" "+customer.getLastName());
    }
        // this.logger.log(customer.getFirstName()+" "+customer.getLastName());
        public void addMultipleCustomer(Customer customers[]){
           for (Customer customer:customers){
               add(customer);
        }
    }

}
