package tam.group_bbv181.car_rentals.services.login.interfaces;

import tam.group_bbv181.car_rentals.model.LoginUser;

import java.util.List;

public interface ILoginService {
    List<LoginUser> getAll();

    LoginUser get(String id);
    LoginUser create(LoginUser login);
    LoginUser update(LoginUser loginUser);
    LoginUser delete(String id);

    LoginUser userAccount(String login, String password);
    boolean uniqueLogin(String login);
}
