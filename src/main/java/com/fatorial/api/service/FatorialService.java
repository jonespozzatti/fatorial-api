package com.fatorial.api.service;

import org.springframework.stereotype.Service;

import com.fatorial.api.utils.Fatorial;

@Service
public class FatorialService {
	
	public Integer calcularService(Integer valor) throws Exception {
		
		Fatorial fat =  new Fatorial();
		
		return fat.fat(valor);
		
	}
}
