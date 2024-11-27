package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Controller.HomeController;

@SpringBootApplication
public class FirstSpringBootApplication {

//	private static HomeController hcl;
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
//		hcl.insertEmployee();
		System.out.println("Hello World");
	}

}
