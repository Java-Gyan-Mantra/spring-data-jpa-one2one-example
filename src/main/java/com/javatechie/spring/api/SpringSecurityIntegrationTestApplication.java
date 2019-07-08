package com.javatechie.spring.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.api.entity.Person;
import com.javatechie.spring.api.repository.PersonRepository;

@SpringBootApplication
@RestController
public class SpringSecurityIntegrationTestApplication {
	
	@Autowired
	private PersonRepository repository;
	
	@GetMapping("/test")
	public String test() {
		return "hi";
	}
	
	@PostMapping("/savePerson")
	public String savePerson(@RequestBody Person person) {
		Person p=repository.save(person);
		return "person saved successfully...."+p;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityIntegrationTestApplication.class, args);
	}

}
