package tam.group_bbv181.car_rentals.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.model.Person;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findCustomerByPerson(Person person);
}
