package web.Dao;


import web.Model.User;

import java.util.List;

public interface UserDao {

    List<User> getUserList();
    User show(long id);
    void save(User user);
    void update(User user);
    void delete(long id);
}