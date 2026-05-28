package web.Service;


import org.springframework.transaction.annotation.Transactional;
import web.Model.User;

import java.util.List;


public interface UserService {


    List<User> getUserList();
    User show(long id);
    void save(User user);
    void update(User user);
    void delete(long id);
}
