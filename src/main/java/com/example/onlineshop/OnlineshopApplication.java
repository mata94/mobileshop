package com.example.onlineshop;

import com.example.onlineshop.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;


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
