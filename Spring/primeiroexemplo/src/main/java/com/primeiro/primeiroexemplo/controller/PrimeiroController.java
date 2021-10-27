package com.primeiro.primeiroexemplo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class PrimeiroController  {
	
	@GetMapping ("/Atividade1")
	public String atividade1 () {
		return "atenção aos detalhes, persistência";
	}
	@GetMapping ("/Atividade2")
	public String atividade2 () {
		return "O objetivo de aprendizagem é desenvolver como funciona o Spring Boot";
	}
}
