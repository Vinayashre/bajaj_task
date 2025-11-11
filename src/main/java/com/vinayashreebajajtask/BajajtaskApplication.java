package com.vinayashreebajajtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.vinayashreebajajtask.model.User;
import com.vinayashreebajajtask.repository.UserRepository;

@SpringBootApplication
public class BajajtaskApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BajajtaskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("✅ Application started... Testing DB connection!");

		User user = new User();
		user.setName("Vinayashree");
		user.setEmail("vinay@example.com");

		userRepository.save(user);

		System.out.println("✅ User saved successfully!");
	}
}
