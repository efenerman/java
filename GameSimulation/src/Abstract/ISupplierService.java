package Abstract;

import Entities.Customer;
import Entities.Game;

public interface ISupplierService {
    void sell(Game game, Customer customer);

}
