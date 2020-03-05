package com.fatorial.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fatorial.api.service.FatorialService;

@SpringBootApplication
public class FatorialApplication {
	
	@Autowired
	private FatorialService fatorialService;
	
	public static void main(String[] args) {
		SpringApplication.run(FatorialApplication.class, args);
		
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println(fatorialService.calcularService(4));
		};
	}
	
}
