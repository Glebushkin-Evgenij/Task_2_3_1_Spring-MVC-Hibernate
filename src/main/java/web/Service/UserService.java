package web.Service;


import web.Model.User;

import java.util.List;


public interface UserService {


    List<User> getUserList();
    User show(long id);
    void save(User user);
    void update(User user);
    void delete(long id);
}
