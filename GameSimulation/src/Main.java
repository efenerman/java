import Abstract.BaseCampaignManager;
import Abstract.BaseCustomerManager;
import Abstract.BaseSupplierManager;
import Adapters.EdevletAdapter;
import Adapters.SupplierServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.SupplierManager;
import Entities.Game;
import Entities.Gamer;
import Entities.Supplier;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager baseCustomerManager=new GamerManager(new EdevletAdapter());
        BaseSupplierManager baseSupplierManager=new SupplierManager(new SupplierServiceAdapter());
        BaseCampaignManager baseCampaignManager=new CampaignManager(new SupplierServiceAdapter());

        Gamer gamer=new Gamer(2,"Benjamin","Button",new Date(1997,5,11),"11111111111","yokartikdahaneler");
        Supplier supplier=new Supplier(7,"Hagrid","Raven",new Date(1889,5,8),"2455656565","0433425353533");
        Game game1=new Game(121,"Ratchet&Clank",619.99,10);
        Game game2=new Game(156,"Returnal",529.99,10);
        baseCustomerManager.add(gamer);
        baseCustomerManager.update(gamer);
        baseCustomerManager.delete(gamer);
        System.out.println("*****************************");
        baseSupplierManager.sell(game1,gamer);
        System.out.println("*************************");
        baseCampaignManager.createCampaign(game2,supplier);
        baseCampaignManager.updateCampaign(game2,supplier);
        baseCampaignManager.deleteCampaign(game2,supplier);

    }
}
