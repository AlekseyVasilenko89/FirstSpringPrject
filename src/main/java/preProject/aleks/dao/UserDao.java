package preProject.aleks.dao;

import preProject.aleks.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> getAll();

    User getById(Integer id);

    void update(User user);

    void remove(Integer id);

    User getByNameAndPassword(String name, String password);
}
