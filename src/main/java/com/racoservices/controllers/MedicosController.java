package com.racoservices.controllers;

import com.racoservices.models.Medicos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicosController {
    

    @GetMapping("/medicos")
    public Medicos listar (){
        return new Medicos(56, "Daniel", "Paredes", "Cardiologo");
    }


}