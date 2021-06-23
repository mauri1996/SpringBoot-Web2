package ucuenca.ejemplo.store.shoppingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ucuenca.ejemplo.store.shoppingservice.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}