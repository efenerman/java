package Concrete;

import Abstract.BaseCampaignManager;
import Abstract.ISupplierCampaignService;
import Abstract.ISupplierService;
import Entities.Customer;
import Entities.Game;

public class CampaignManager  extends BaseCampaignManager {
 ISupplierCampaignService iSupplierCampaignService;

    public CampaignManager(ISupplierCampaignService iSupplierCampaignService) {
        this.iSupplierCampaignService = iSupplierCampaignService;
    }
    @Override
    public void updateCampaign(Game game,Customer customer){
        game.setPrice(this.iSupplierCampaignService.discount(game));
        super.updateCampaign(game,customer);
    }
}
