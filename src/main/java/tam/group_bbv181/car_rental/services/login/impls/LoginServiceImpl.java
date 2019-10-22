package tam.group_bbv181.car_rental.services.login.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rental.model.Customer;
import tam.group_bbv181.car_rental.model.LoginUser;
import tam.group_bbv181.car_rental.model.Person;
import tam.group_bbv181.car_rental.repository.CustomerRepository;
import tam.group_bbv181.car_rental.repository.LoginRepository;
import tam.group_bbv181.car_rental.repository.PersonRepository;
import tam.group_bbv181.car_rental.services.login.interfaces.ILoginService;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class LoginServiceImpl implements ILoginService {
    @Autowired
    LoginRepository loginRepository;

    @Autowired
    PersonRepository personRepository;

    @Autowired
    CustomerRepository customerRepository;

    @PostConstruct
    void init(){
        personRepository.deleteAll();
        Person pash = new Person("qwer","qwer", "qwer", true);
        personRepository.save(pash);
        Customer qwer1 = new Customer(pash,"qwerrttyyu",1234567890,"qwert@mail.com");
        customerRepository.save(qwer1);
        loginRepository.deleteAll();
        LoginUser Qwer = new LoginUser("qwer","1234", qwer1);
        loginRepository.save(Qwer);
    }

    @Override
    public List<LoginUser> getAll() {
        return loginRepository.findAll();
    }

    @Override
    public LoginUser get(String id) {
        return loginRepository.findById(id).orElse(null);
    }

    @Override
    public LoginUser create(LoginUser loginUser) {
        return loginRepository.save(loginUser);
    }

    @Override
    public LoginUser update(LoginUser loginUser) {
        return loginRepository.save(loginUser);
    }

    @Override
    public LoginUser delete(String id) {
        LoginUser loginUser = this.get(id);
        loginRepository.deleteById(id);
        return loginUser;
    }

    @Override
    public LoginUser userAccount(String login, String password) {
        return loginRepository.findByLoginAndPassword(login, password);
    }
}
