package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+" registration completed");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+" update completed");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" "+" remove completed");
    }
}
