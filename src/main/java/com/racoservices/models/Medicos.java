package com.racoservices.models;

public class Medicos {

    private Integer idMedicos;
    private String nombres;
    private String apellidos;
    private String especialidad;

    public Medicos(Integer idMedicos, String nombres, String apellidos, String especialidad) {
        this.idMedicos = idMedicos;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }

    public Integer getIdMedicos() {
        return idMedicos;
    }

    public void setIdMedicos(Integer idMedicos) {
        this.idMedicos = idMedicos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    

    
    
}