package com.skk.angularspringmongo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngularSpringMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AngularSpringMongoApplication.class, args);
	}

	CommandLineRunner commandLineRunner(){
		return args -> System.out.println("Application Name: "+AngularSpringMongoApplication.class);
	}
}
