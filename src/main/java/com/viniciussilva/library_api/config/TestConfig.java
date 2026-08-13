package com.viniciussilva.library_api.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.viniciussilva.library_api.entities.Book;
import com.viniciussilva.library_api.entities.User;
import com.viniciussilva.library_api.repositories.BookRepository;
import com.viniciussilva.library_api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Joao Roberto", "robertojoao@gmail.com", "99997777", true);
		User u2 = new User(null, "Guilhermino Soares", "soaresguilhermino@gmail.com", "999998888", true);
		
		Book b1 = new Book(null, "Hoobt", "7777", 2001, 500, 200);
		Book b2 = new Book(null, "Senhor dos aneis", "7777", 2005, 700, 400);
		Book b3 = new Book(null, "Harry Potter", "7777", 2009, 800, 500);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		bookRepository.saveAll(Arrays.asList(b1, b2, b3));
	}
	
	
}
