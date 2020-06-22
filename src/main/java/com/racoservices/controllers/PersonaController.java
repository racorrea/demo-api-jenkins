package com.racoservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.racoservices.models.Persona;

@RestController
public class PersonaController {
	
	@GetMapping("/personas")
	public Persona listar() {
		return new Persona(25698, "Paul", "Ramón", 29);
	}

	@GetMapping("/persona/edad/{edad}")
    public Medicos listar (@PathVariable Intenger edad){
        return new Medicos(56, "Carlos", "Rodriguez", edad);
	}
	
	/**
	 * Juanito 2020-06-22
	 * @param edad
	 * @return
	 */
	@GetMapping("/persona/edad/{edad}")
    public Medicos listar (@PathVariable Intenger edad){
        return new Medicos(56, "Carlos", "Rodriguez", edad);
    }

	

}
