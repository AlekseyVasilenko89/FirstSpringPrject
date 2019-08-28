package preProject.aleks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import preProject.aleks.model.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> listAll() {
        return repository.findAll();
    }

    public void save(User user) {
        repository.save(user);
    }

    public User get(Integer id) {
        return repository.getOne(id);
    }

    public void delete(Integer id) {
        repository.delete(id);
    }
}
