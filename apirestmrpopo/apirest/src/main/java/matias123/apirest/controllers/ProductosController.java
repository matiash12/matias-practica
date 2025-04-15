package matias123.apirest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductosController {
    
    @GetMapping ("/productos")
    public String productoa(){
        return "queso,leche,carne,torta";
    }
}
