package Adapters;

import Abstract.ISupplierCampaignService;
import Entities.Game;

public class SupplierServiceAdapter  implements ISupplierCampaignService {
    @Override
    public double discount(Game game) {
        return game.getPrice()-(game.getPrice()* game.getDiscount())/100;
    }
}
