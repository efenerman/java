package Abstract;

import Entities.Customer;
import Entities.Game;

public abstract class BaseCampaignManager implements ICampaignService{
    @Override
    public void createCampaign(Game game, Customer customer) {
        game.setDiscount(10);
        System.out.println(customer.getFirstName()+" make campaign" + " : " + game.getGameName() + " with this name " + game.getDiscount() + "% promotion!");

    }

    @Override
    public void updateCampaign(Game game, Customer customer) {

game.setDiscount(10);
        System.out.println(customer.getFirstName()+" update campaign" + " : " + game.getGameName() + " New price: " + game.getPrice());
    }

    @Override
    public void deleteCampaign(Game game, Customer customer) {
        System.out.println(customer.getFirstName() +" deleted campaign"+ " => " + game.getGameName() + " remove from discount");
    }
}
