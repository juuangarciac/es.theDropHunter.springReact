package es.theDropHunter.StartUp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

import es.theDropHunter.StartUp.repositories.UserRepository;

@SpringBootApplication
public class StartUpApplication{

	
	public static void main(String[] args) {
		SpringApplication.run(StartUpApplication.class, args);
	}

}
