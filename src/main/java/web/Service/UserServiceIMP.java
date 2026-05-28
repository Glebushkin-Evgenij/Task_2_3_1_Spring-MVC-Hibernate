package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.Dao.UserDao;
import web.Model.User;

import java.util.List;
@Service
@Transactional
public class UserServiceIMP implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceIMP(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }


    @Override
    public User show(long id) {
        return userDao.show(id);


    }


    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user){
        userDao.update(user);
    }

    @Override
    public void delete(long id){
        userDao.delete(id);

    }
}
