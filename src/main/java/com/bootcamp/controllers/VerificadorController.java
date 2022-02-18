package com.bootcamp.controllers;

import com.bootcamp.services.VerificadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/verificador/")
public class VerificadorController {

    @Autowired
    private VerificadorService verificadorService;

    @GetMapping("/{dni}")
    public int calcular(@PathVariable("dni") int dni){
        return verificadorService.CalcularDigitoVerificador(dni);
    }

}
