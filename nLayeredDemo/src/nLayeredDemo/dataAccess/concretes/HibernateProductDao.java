package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.Entities.concretes.Product;
import nLayeredDemo.dataAccess.abstracts.ProductDao;

import java.util.List;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Added with hibernate... "+product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product getProduct(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
