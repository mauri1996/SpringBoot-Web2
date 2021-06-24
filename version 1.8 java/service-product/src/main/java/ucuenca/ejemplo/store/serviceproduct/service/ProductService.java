package ucuenca.ejemplo.store.serviceproduct.service;

import ucuenca.ejemplo.store.serviceproduct.entity.Category;
import ucuenca.ejemplo.store.serviceproduct.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> listAllProduct();
    public Product getProduct(Long id);

    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public  Product deleteProduct(Long id);
    public List<Product> findByCategory(Category category);
    public Product updateStock(Long id, Double quantity);
}
