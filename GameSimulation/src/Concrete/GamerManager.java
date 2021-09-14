package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;
import Entities.Game;

public class GamerManager extends BaseCustomerManager {
    ICustomerCheckService iCustomerCheckService;

    public GamerManager(ICustomerCheckService iCustomerCheckService) {
        this.iCustomerCheckService = iCustomerCheckService;
    }
@Override
    public void add(Customer customer){
        if (this.iCustomerCheckService.checkifRealPerson(customer)){
            super.add(customer);
        }
        else{
            System.out.println("No valid person");
        }
}
}
