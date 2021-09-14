package nLayeredDemo;

import nLayeredDemo.Business.abstracts.ProductService;
import nLayeredDemo.Business.concretes.ProductManager;
import nLayeredDemo.Core.JLoggerManagerAdapter;
import nLayeredDemo.Entities.concretes.Product;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;


public class Main {
    public static void main(String[] args) {
       //spring IoC ile çözülecek
        ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product=new Product(1,2,"IPhone11",12,50);
        productService.add(product);

    }
}
