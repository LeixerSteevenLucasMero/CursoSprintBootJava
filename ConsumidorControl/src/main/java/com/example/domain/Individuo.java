package com.example.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import lombok.Data;

//Con data nos da todos los metodos de get, set si necesidad de ponerlos
@Data
@Entity
//Table es para identificar el nombre de la tabla de La DB de mysql 
@Table(name="individuo")
public class Individuo implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_individuo;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String edad;
    @NotEmpty
    @Email
    private String correo;
    @NotEmpty     
    private String telefono;
}
