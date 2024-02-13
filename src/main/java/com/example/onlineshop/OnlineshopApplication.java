package com.example.onlineshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineshopApplication implements ApplicationRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(OnlineshopApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) {
		userService.adminRegistration();
	}
}
