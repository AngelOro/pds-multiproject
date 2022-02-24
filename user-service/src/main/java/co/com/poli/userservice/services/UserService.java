package co.com.poli.userservice.services;

import co.com.poli.userservice.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);

    Boolean delete(User user);

    List<User> findAll();

    User findById(Long id);

}
