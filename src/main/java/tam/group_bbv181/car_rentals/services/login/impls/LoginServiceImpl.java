package tam.group_bbv181.car_rentals.services.login.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.model.Customer;
import tam.group_bbv181.car_rentals.model.LoginUser;
import tam.group_bbv181.car_rentals.model.Person;
import tam.group_bbv181.car_rentals.repository.CustomerRepository;
import tam.group_bbv181.car_rentals.repository.LoginRepository;
import tam.group_bbv181.car_rentals.repository.PersonRepository;
import tam.group_bbv181.car_rentals.services.login.interfaces.ILoginService;

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
        customerRepository.deleteAll();
        personRepository.deleteAll();
        loginRepository.deleteAll();

        Person pash = new Person("Bazil","Pash", "Anodov", true);
        Person desi = new Person("Jan","Desi", "Emue", true);
        Person tester = new Person("Anna","Tester", "Oyen", false);
        Person pash1 = new Person("Qwer","Rewq", "Ywer", true);

        Customer bazil = new Customer(personRepository.save(pash),"qwrewt",
                    45679689,"qwer@gmail.com");
        Customer jan = new Customer(personRepository.save(desi),"zxcxczcz",
                    436554,"asdf@gmail.com");
        Customer anna = new Customer(personRepository.save(tester),"wqqrrwer",
                    323774,"zvcx@mail.com");
        Customer qwer1 = new Customer(personRepository.save(pash1),"qwerrttyy",
                1234567890,"qwert@mail.com");

        anna.setBonusPoints(7);
        bazil.setBonusPoints(20);

        LoginUser baziL = new LoginUser("QWER","1234",
                customerRepository.save(bazil));
        LoginUser jaN = new LoginUser("QWERTY","1234",
                customerRepository.save(jan));
        LoginUser annA = new LoginUser("qwerty","1234",
                customerRepository.save(anna));
        LoginUser qweR = new LoginUser("qwer","1234",
                customerRepository.save(qwer1));

        loginRepository.save(baziL);
        loginRepository.save(jaN);
        loginRepository.save(annA);
        loginRepository.save(qweR);
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

    @Override
    public boolean uniqueLogin(String login) {
        List<LoginUser> loginUserList = this.getAll();
        for (LoginUser item: loginUserList) {
            if(item.getLogin().equals(login)){
                return false;
            }
        }
        return true;
    }
}
