package preProject.aleks.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import preProject.aleks.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {


    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAll() {
        Session session = this.sessionFactory.getCurrentSession();
        List<User> users = session.createQuery("from User").list();
        return users;
    }

    @Override
    public User getById(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = session.load(User.class, id);
        return user;
    }

    @Override
    public void update(User user) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(user);
    }

    @Override
    public void remove(Integer id) {
        Session session = this.sessionFactory.getCurrentSession();
        User user = session.load(User.class, id);

        if (user != null) {
            session.delete(user);
        }
    }

    @Override
    public User getByNameAndPassword(String name, String password) {
        return null;
    }
}
