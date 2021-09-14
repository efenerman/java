package nLayeredDemo.Business.abstracts;

import nLayeredDemo.Entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
