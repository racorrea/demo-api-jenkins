package com.racoservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.racoservices.models.Persona;

@RestController
public class PersonaController {
	
	@GetMapping("/eventos")
	public Persona listar() {
		return new Persona(25698, "Hello World!", " PIS - 2021 ", 2020);
	}

}
