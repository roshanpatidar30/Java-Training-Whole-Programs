package com.auth.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@SpringBootApplication
@EnableWebFluxSecurity
public class AuthMicroservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(AuthMicroservice1Application.class, args);
	}

}
