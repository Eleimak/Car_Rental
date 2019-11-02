package tam.group_bbv181.car_rentals.services.login.interfaces;

import com.mongodb.lang.NonNull;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import tam.group_bbv181.car_rentals.model.LoginUser;

import java.util.List;
import java.util.Optional;

public interface ILoginService {
    List<LoginUser> getAll();

    LoginUser get(String id);
    LoginUser create(LoginUser login);
    LoginUser update(LoginUser loginUser);
    LoginUser delete(String id);

    boolean uniqueLogin(String login);
    public boolean isNotNull(LoginUser loginUser);
    Optional<LoginUser> findByUsername(@NonNull String username);
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
