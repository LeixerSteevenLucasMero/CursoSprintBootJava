package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorREST {
    @GetMapping("/")
    //metodo publico
    public String comienzo(){
        
        log.info("estoy ejecutando en controller rest");
//        log.debug("mas informacion");
        return "Hola mundo en spirnt";
    }
    
}
