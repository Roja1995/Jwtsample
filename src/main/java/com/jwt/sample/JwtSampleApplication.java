package com.jwt.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import com.jwt.sample.entity.Users;
import com.jwt.sample.repository.UserRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@EntityScan("com.jwt.sample.*")
@ComponentScan("com.jwt.sample.*")
public class JwtSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSampleApplication.class, args);
	}

}
