package com.fatorial.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatorial.api.service.FatorialService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/fatorial")
public class FatorialController {

	@Autowired
	private FatorialService fatorialService;
	
	@GetMapping(value = "/{valor}")
	public Integer fatorial(@PathVariable("valor") Integer valor) throws Exception{
		return fatorialService.calcularService(valor);
	}
}
