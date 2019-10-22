package tam.group_bbv181.car_rental.services.customers.interfaces;

import tam.group_bbv181.car_rental.model.Customer;

import java.util.List;

public interface ICustomersService {
    List<Customer> getAll();
    Customer get(String id);
    Customer create(Customer customer);
    Customer update(Customer customer);
    Customer delete(String id);
}
