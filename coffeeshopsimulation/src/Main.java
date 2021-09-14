import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(
                new MernisServiceAdapter());
        baseCustomerManager.save(new Customer(10,"EFE","NERMAN",LocalDate.of(1997,12,7), "111111111"));


    }
}
