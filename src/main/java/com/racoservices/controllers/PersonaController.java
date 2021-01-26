package com.racoservices.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.racoservices.models.Medicos;
import com.racoservices.models.Persona;

@RestController
public class PersonaController {
	
	@GetMapping("/personas")
	public Persona listar() {
		return new Persona(25698, "Paul", "Ramón", 29);
	}

	@GetMapping("/persona/edad/{edad}")
    public Medicos listar2 (@PathVariable String edad){
        return new Medicos(56, "Carlos", "Rodriguez", edad);
	}

	@GetMapping("/persona/nombre/{nombre}")
    public Medicos listar3 (@PathVariable String nombre){
        return new Medicos(56, nombre, "Rodriguez", 15);
	}

	@GetMapping("/persona/apellido/{apellido}")
    public Medicos listar4 (@PathVariable String apellido){
        return new Medicos(56, "Juanito", apellido, 33);
	}
	

}
