package com.example.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
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
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String edad;
}
