package com.viniciussilva.library_api.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.viniciussilva.library_api.entities.User;
import com.viniciussilva.library_api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Joao Roberto", "robertojoao@gmail.com", "99997777", true);
		User u2 = new User(null, "Guilhermino Soares", "soaresguilhermino@gmail.com", "999998888", true);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
