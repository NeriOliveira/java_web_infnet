package br.com.patrickinfnet.entregaservice.controller;

import br.com.patrickinfnet.entregaservice.exception.ColetaNotFoundException;
import br.com.patrickinfnet.entregaservice.model.Coleta;
import br.com.patrickinfnet.entregaservice.payload.ResponsePayload;
import br.com.patrickinfnet.entregaservice.service.ColetaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/")
public class ColetaController {
    @Autowired
    ColetaService coletaService;
    Logger LOGGER = LoggerFactory.getLogger(ColetaController.class);
    @GetMapping
    public List<Coleta> getAll(){
        List<Coleta> all = coletaService.getAll();
        LOGGER.info("GET ALL: " + all);
        return all;
    }
    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Integer id){
        try {
            Coleta coleta = coletaService.getById(id);
            LOGGER.info("GET BY ID: "+coleta);
            return ResponseEntity.ok(coleta);
        }catch (ColetaNotFoundException ex){
            LOGGER.info("GET BY ID: Produto não encontrado");
            ResponsePayload notFound = ResponsePayload.builder().message("Not Found").dateTime(LocalDateTime.now()).build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notFound);
        }
    }

    @PutMapping("/coletado/{id}")
    public ResponseEntity updateColetado(@PathVariable Integer id){
        try{
            Coleta coleta = coletaService.updateColetado(id);
            LOGGER.info("PUT COLETADO ID: "+coleta);
            return ResponseEntity.ok(coleta);
        } catch (ColetaNotFoundException ex) {
            LOGGER.info("PUT COLETADO ID: Produto não encontrado");
            ResponsePayload notFound = ResponsePayload.builder().message("Not Found").dateTime(LocalDateTime.now()).build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notFound);
        }
    }

    @PutMapping("/pendente/{id}")
    public ResponseEntity updatePendente(@PathVariable Integer id){
        try{
            Coleta coleta = coletaService.updatePendente(id);
            LOGGER.info("PUT PENDENTE ID: "+coleta);
            return ResponseEntity.ok(coleta);
        } catch (ColetaNotFoundException ex) {
            LOGGER.info("PUT PENDENTE ID: Produto não encontrado");
            ResponsePayload notFound = ResponsePayload.builder().message("Not Found").dateTime(LocalDateTime.now()).build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(notFound);
        }
    }
}
