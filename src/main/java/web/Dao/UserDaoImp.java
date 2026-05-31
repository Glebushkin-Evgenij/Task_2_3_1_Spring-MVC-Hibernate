package web.Dao;

import org.springframework.stereotype.Repository;

import web.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext()
    private EntityManager entityManager;


    @Override
    public List<User> getUserList() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public User show(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
    entityManager.persist(user);
    entityManager.flush();
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
        entityManager.flush();
    }

    @Override
    public void delete(long id) {
        User user = show(id);
        if (user != null) {
            entityManager.remove(user);
        }

    }

}
