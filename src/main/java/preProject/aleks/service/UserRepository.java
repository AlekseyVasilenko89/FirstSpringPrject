package preProject.aleks.service;

import org.springframework.data.jpa.repository.JpaRepository;
import preProject.aleks.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
