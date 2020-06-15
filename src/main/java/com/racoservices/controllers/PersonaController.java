package com.racoservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.racoservices.models.Persona;

@RestController
public class PersonaController {
	
	@GetMapping("/personas")
	public Persona listar() {
		return new Persona(25698, "Paul", "Ramón", 22);
	}

}
