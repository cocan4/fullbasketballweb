package com.finalBasketballWeb.fullbasketballweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullbasketballwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullbasketballwebApplication.class, args);
		System.out.println("ioc is loaded");
	}

}
