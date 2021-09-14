package Abstract;

import Entities.Customer;
import Entities.Game;

public abstract class BaseSupplierManager implements ISupplierService {
    @Override
    public void sell(Game game, Customer customer){
        System.out.println("Game Name: "+game.getGameName()+"=> "+customer.getFirstName()+" "+customer.getLastName() +"  buy this game"+" with this price " +game.getPrice());

    }
}
