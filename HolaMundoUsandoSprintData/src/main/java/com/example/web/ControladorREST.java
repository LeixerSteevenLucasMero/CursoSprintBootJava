package com.example.web;

import com.example.dao.IindividuoDao;
import com.example.domain.Individuo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorREST {
    
    //       para inyectar el uso de la interfaz Iindividuo
    @Autowired
    private IindividuoDao individuoDao;
    
    @GetMapping("/")
    public String comienzo(Model model){
        
        //Con esto se consume los datos de la db en la vista
        Iterable<Individuo> individuos = individuoDao.findAll();
        log.info("estoy ejecutando en controller MVC");
        model.addAttribute("individuos", individuos);
        return "indice";
    }
    
}



//PARTES DEL VIDEO
//public class ControladorREST {
//    
////    @Value("${indice.hola2}")
////    private String hola2;
//    @GetMapping("/")
//    //metodo publico
//    public String comienzo(Model model){
//        String hola="hola mundo con sprint boot";
//        
//        
//        //forma para mandar un modelo de datos en la vista
//        Individuo individuo = new Individuo();
//        individuo.setNombre("Leixer");
//        individuo.setApellido("Lucas");
//        individuo.setCorreo("leixxer@gamil.com");
//        individuo.setTelefono("12121");
//        individuo.setEdad("22");
//        Individuo individuo2 = new Individuo();
//        individuo2.setNombre("Leixer1");
//        individuo2.setApellido("Lucs1");
//        individuo2.setCorreo("leixxer1@gamil.com");
//        individuo2.setTelefono("121211111");
//        individuo2.setEdad("2211");
//
//        
////        List<Individuo> individuos = new ArrayList();
////        individuos.add(individuo);
////        individuos.add(individuo);
//        
//        List individuos = Arrays.asList(individuo, individuo2);
//
//        
//                
//        
//        
//        
//        
//        log.info("estoy ejecutando en controller MVC");
//        model.addAttribute("hola", hola);
//        model.addAttribute("hola2", hola2);
//        model.addAttribute("individuo", individuo);
//        model.addAttribute("individuos", individuos);
//        return "indice";
//    }
//    
//}
