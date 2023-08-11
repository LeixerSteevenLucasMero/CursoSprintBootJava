package com.example.domain;

import lombok.Data;

@Data
//Con data nos da todos los metodos de get, set si necesidad de ponerlos
public class Individuo {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String edad;
    
}
