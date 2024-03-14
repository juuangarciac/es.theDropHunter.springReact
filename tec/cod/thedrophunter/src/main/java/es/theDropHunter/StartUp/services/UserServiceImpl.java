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
    public Optional<User> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public User save(User user) {
        return null;
    }
    
    @Transactional
    @Override
    public void delete(User user) {

    }


}
