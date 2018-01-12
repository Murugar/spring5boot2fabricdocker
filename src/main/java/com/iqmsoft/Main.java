package com.iqmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Builder;
import lombok.Data;

@RestController
@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@GetMapping
	public Customer get() {
		return Customer.builder().firstname("Test1").lastname("Test2").build();
	}
}

@Data
@Builder
class Customer {
	private String firstname, lastname;
}
