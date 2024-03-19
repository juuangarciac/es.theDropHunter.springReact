package es.theDropHunter.StartUp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.theDropHunter.StartUp.entities.User;
import es.theDropHunter.StartUp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public User save(User user) {
        return repository.save(user);
    }
    
    @Transactional
    @Override
    public Optional<User> delete(User user) {
        Optional<User> userOptional = repository.findById(user.getId());
        userOptional.ifPresent(userDb -> {
            repository.delete(userDb);
        });
        return userOptional;
    }


}
