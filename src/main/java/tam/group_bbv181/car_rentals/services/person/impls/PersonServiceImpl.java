package tam.group_bbv181.car_rentals.services.person.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tam.group_bbv181.car_rentals.model.LoginUser;
import tam.group_bbv181.car_rentals.model.Person;
import tam.group_bbv181.car_rentals.repository.LoginRepository;
import tam.group_bbv181.car_rentals.repository.PersonRepository;
import tam.group_bbv181.car_rentals.services.login.impls.LoginServiceImpl;
import tam.group_bbv181.car_rentals.services.person.interfaces.IPersonService;

import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    PersonRepository personRepository;
    @Autowired
    LoginServiceImpl loginService;

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @Override
    public Person get(String id) {
        return personRepository.findById(id).orElse(null);
    }

    @Override
    public Person create(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person update(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person delete(String id) {
        Person person = this.get(id);
        personRepository.deleteById(id);
        if(person.getLoginUser()!=null) {
            loginService.delete(person.getLoginUser().getId());
        }
        return person;
    }

    @Override
    public Person getPersonLoginUser(LoginUser loginUser){
        return personRepository.findPersonByLoginUser(loginUser);
    }

    @Override
    public boolean isNotEmptyFields(Person person) {
        if(person.getFirstName().equals("")){return true;}
        if(person.getLastName().equals("")){return true;}
        if(person.getMiddleName().equals("")){return true;}
        return false;
    }
}
