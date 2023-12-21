package br.com.patrickinfnet.entregaservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ColetaController {
    Logger LOGGER = LoggerFactory.getLogger(ColetaController.class);
    @GetMapping
    public void getAll(){
        LOGGER.info("GET ALL");
    }
    @GetMapping("/{id}")
    public void getById(@PathVariable Integer id){
        LOGGER.info("GET BY ID: "+id);
    }

    @PutMapping("/coletado/{id}")
    public void updateColetado(@PathVariable Integer id){
        LOGGER.info("PUT COLETADO ID: "+id);
    }

    @PutMapping("/pendente/{id}")
    public void updatePendente(@PathVariable Integer id){
        LOGGER.info("PUT PENDENTE ID: "+id);
    }
}
