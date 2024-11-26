package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloWorldController {

	@GetMapping ("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}

	@GetMapping ("/lista-bsm")
	public String listaBSM() {
		return  "Mentalidades:\r\n"
			+ "Orientação ao futuro\r\n"
			+ "Responsabilidade Pessoal\r\n"
			+ "Mentalidade de crescimento\r\n"
			+ "Persistência\r\n"
			+ "Habilidade:\r\n"
			+ "Trabalho em equipe\r\n"
			+ "Atenção aos detalhes\r\n"
			+ "Proatividade\r\n"
			+ "Comunicação";
	}	
	@GetMapping ("/lista-semana")
	public String listaSemana() {
		return   "Objetivos para a Semana:\r\n"
				+"Rever as matérias\r\n"
				+ "Lê o cookbook\r\n"
				+ "Assistir aulas extras sobre o conteúdo";
}
	
	
}
