package tam.group_bbv181.car_rental.services.customer.interfaces;

import tam.group_bbv181.car_rental.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();
    Customer get(String id);
    Customer create(Customer customer);
    Customer update(Customer customer);
    Customer delete(String id);

    boolean isNotEmptyFields(Customer customer);
}
