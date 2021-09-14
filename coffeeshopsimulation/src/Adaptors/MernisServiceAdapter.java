package Adaptors;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisService.GBFKPSPublicSoap;
import MernisService.GBFKPSPublicSoap12;

import java.util.Locale;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        GBFKPSPublicSoap client=new GBFKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),
                    customer.firstName.toUpperCase(), customer.lastName.toUpperCase(),
                    customer.dateOfBirth.getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  false;
    }
}
