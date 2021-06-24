package ucuenca.ejemplo.store.shoppingservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ucuenca.ejemplo.store.shoppingservice.model.Customer;

@FeignClient(name = "customer-service")
@RequestMapping("/customers")
public interface CustomerClient {

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id);
}
