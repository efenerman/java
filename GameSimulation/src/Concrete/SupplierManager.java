package Concrete;

import Abstract.BaseSupplierManager;
import Adapters.SupplierServiceAdapter;
import Entities.Customer;
import Entities.Game;

public class SupplierManager extends BaseSupplierManager {
    SupplierServiceAdapter supplierServiceAdapter;

    public SupplierManager(SupplierServiceAdapter supplierServiceAdapter) {
        this.supplierServiceAdapter = supplierServiceAdapter;
    }
    @Override
    public void sell(Game game, Customer customer){
        game.setPrice(this.supplierServiceAdapter.discount(game));
        super.sell(game,customer);
    }
}
