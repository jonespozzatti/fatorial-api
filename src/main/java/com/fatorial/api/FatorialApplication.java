package com.fatorial.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatorial.api.utils.Fatorial;

@SpringBootApplication
public class FatorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FatorialApplication.class, args);
		Fatorial fat = new Fatorial();
		try {
			System.out.println("O fatorial é: " + fat.fat(2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
