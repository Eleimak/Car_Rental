package tam.group_bbv181.car_rentals.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LoginUser {
    @Id
    private String id;
    private String login;
    private String password;
    private Customer customer;

    public LoginUser() {
    }

    public LoginUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public LoginUser(String login, String password, Customer customer) {
        this.login = login;
        this.password = password;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", customer=" + customer +
                '}';
    }
}
