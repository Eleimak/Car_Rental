package tam.group_bbv181.car_rental.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import tam.group_bbv181.car_rental.model.Customer;
import tam.group_bbv181.car_rental.model.LoginUser;

@Repository
public interface LoginRepository extends MongoRepository<LoginUser, String> {
    LoginUser findByLoginAndPassword(String login, String password);
    LoginUser findByCustomer(Customer customer);
}
