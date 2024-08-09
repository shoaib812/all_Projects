package com.dummyproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LayeredProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LayeredProjectApplication.class, args);
		System.out.println(" This is a layered project....");
	}

}
