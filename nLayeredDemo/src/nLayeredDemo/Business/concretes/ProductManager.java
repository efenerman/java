package nLayeredDemo.Business.concretes;

import nLayeredDemo.Business.abstracts.ProductService;
import nLayeredDemo.Core.JLoggerManagerAdapter;
import nLayeredDemo.Core.LoggerService;
import nLayeredDemo.Entities.concretes.Product;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

import java.util.List;

public class ProductManager implements ProductService {
   //dependency injection-loosly coupled
     private ProductDao productDao;
    private JLoggerManagerAdapter jLoggerManagerAdapter;
    public ProductManager(ProductDao productDao,JLoggerManagerAdapter jLoggerManagerAdapter) {
        this.productDao = productDao;
        this.jLoggerManagerAdapter=jLoggerManagerAdapter;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1){
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return;
        }
        this.productDao.add(product);
        this.jLoggerManagerAdapter.logToSystem("Ürün eklendi : "+product.getName());


    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
