package ucuenca.ejemplo.store.serviceproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucuenca.ejemplo.store.serviceproduct.entity.Category;
import ucuenca.ejemplo.store.serviceproduct.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    public List<Product>findByCategory(Category catogory);
}
