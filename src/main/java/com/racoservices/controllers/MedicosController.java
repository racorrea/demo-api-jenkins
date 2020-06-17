package com.racoservices.controllers;

import com.racoservices.models.Medicos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicosController {
    

    @GetMapping("/medicos")
    public Medicos listar (){
        return new Medicos(56, "Ismael", "Paredes", "Oncologo");
    }

    @GetMapping("/medicos/especialidad/{especialidad}")
    public Medicos listar (@PathVariable String especialidad){
        return new Medicos(56, "Carlos", "Rodriguez", especialidad);
    }

    @GetMapping("/medicos/{id}")
    public Medicos listar (@PathVariable Integer id){
        return new Medicos(id, "Carlos", "Rodriguez", "cardiologo");
    }


}