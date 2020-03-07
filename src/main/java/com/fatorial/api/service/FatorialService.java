package com.fatorial.api.service;

import org.springframework.stereotype.Service;

import com.fatorial.api.utils.Fatorial;

@Service
public class FatorialService {
	
	public Integer calcularFatorial(Integer valor) throws Exception {
		
		Fatorial fat =  new Fatorial();
		
		return fat.fat(valor);
		
	}
	
	public Integer calcularFatorialRecursivo(Integer valor) throws Exception {
		
		Fatorial fat =  new Fatorial();
		
		return fat.fat(valor);
		
	}
}
