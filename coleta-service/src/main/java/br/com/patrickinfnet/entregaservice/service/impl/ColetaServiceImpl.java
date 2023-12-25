package br.com.patrickinfnet.entregaservice.service.impl;

import br.com.patrickinfnet.entregaservice.exception.ColetaNotFoundException;
import br.com.patrickinfnet.entregaservice.model.Coleta;
import br.com.patrickinfnet.entregaservice.repository.ColetaRepository;
import br.com.patrickinfnet.entregaservice.service.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class ColetaServiceImpl implements ColetaService {
    @Autowired
    ColetaRepository repository;
    @Override
    public List<Coleta> getAll() {
        return repository.findAll();
    }

    @Override
    public Coleta getById(Integer id) {
        return repository.findById(id).orElseThrow(ColetaNotFoundException::new);
    }

    @Override
    public Coleta updatePendente(Integer id) {
        Coleta coleta = getById(id);
        coleta.setPendente(true);
        coleta.setData(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")).truncatedTo(ChronoUnit.MINUTES));
        repository.save(coleta);
        return coleta;
    }

    @Override
    public Coleta updateColetado(Integer id) {
        Coleta coleta = getById(id);
        coleta.setPendente(false);
        coleta.setData(LocalDateTime.now(ZoneId.of("America/Sao_Paulo")).truncatedTo(ChronoUnit.MINUTES));
        repository.save(coleta);
        return coleta;

    }

}
