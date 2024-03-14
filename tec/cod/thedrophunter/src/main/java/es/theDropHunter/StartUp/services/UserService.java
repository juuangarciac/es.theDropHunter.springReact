package es.theDropHunter.StartUp.services;

import java.util.List;
import java.util.Optional;

import es.theDropHunter.StartUp.entities.User;


public interface UserService {
    
    List<User> findAll();
    Optional<User> findById(Integer id);

    User save(User user);

    void delete(User user);
}
