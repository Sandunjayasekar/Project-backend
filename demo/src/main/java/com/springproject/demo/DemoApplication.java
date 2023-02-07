package com.springproject.demo;

import com.springproject.demo.model.User;
import com.springproject.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Sandun", "Rangana", "sandun@gmail.com"));
		this.userRepository.save(new User("kasun", "jaye", "sandun88@gmail.com"));
		this.userRepository.save(new User("nimal", "darshana", "sandusdfn@gmail.com"));
		this.userRepository.save(new User("kasy", "panditha", "sanddfsun@gmail.com"));
	}
}
