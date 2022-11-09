package springboot.service;

import org.springframework.stereotype.Service;
import springboot.model.User;

import java.util.List;

@Service
public interface UserService {
    void saveUser(User user);

    void deleteUser(Long id);

    void updateUser(User user);

    User getById(Long id);

    List<User> getAllUsers();
}
