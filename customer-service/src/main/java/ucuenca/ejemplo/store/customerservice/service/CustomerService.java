package ucuenca.ejemplo.store.customerservice.service;

import ucuenca.ejemplo.store.customerservice.repository.entity.Customer;
import ucuenca.ejemplo.store.customerservice.repository.entity.Region;

import java.util.List;

public interface CustomerService {

    public List<Customer> findCustomerAll();
    public List<Customer> findCustomersByRegion(Region region);

    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
    public  Customer getCustomer(Long id);
}


