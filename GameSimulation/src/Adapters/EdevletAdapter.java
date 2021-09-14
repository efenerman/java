package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class EdevletAdapter implements ICustomerCheckService {

    @Override
    public boolean checkifRealPerson(Customer customer) {
       return customer.getNationalId().length()==11;

    }
}
