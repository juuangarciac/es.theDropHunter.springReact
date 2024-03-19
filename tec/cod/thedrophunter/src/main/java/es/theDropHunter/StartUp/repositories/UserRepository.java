package es.theDropHunter.StartUp.repositories;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import es.theDropHunter.StartUp.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

    Optional<User> findById(Long id);

    
}


    


