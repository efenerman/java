package Abstract;

import Entities.Customer;
import Entities.Game;

public interface ICampaignService {
    void createCampaign(Game game, Customer customer);
    void updateCampaign(Game game, Customer customer);
    void deleteCampaign(Game game, Customer customer);

}
