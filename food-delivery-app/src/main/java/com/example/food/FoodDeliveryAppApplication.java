package com.example.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//mkumar3:demonstrating merge
//mkumar1:demo2 final commit
@SpringBootApplication
public class FoodDeliveryAppApplication {

	public static void main(String[] args) {
		System.out.println("This code is to demonstrate git merge");
		System.out.println("This code may be conflicting");
		System.out.println("Added for conflict");
		SpringApplication.run(FoodDeliveryAppApplication.class, args);
	}

}
