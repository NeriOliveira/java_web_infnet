package br.com.patrickinfnet.entregaservice.service;

import br.com.patrickinfnet.entregaservice.model.Coleta;

import java.util.List;

public interface ColetaService {
    List<Coleta> getAll();

    Coleta updateColetado(Integer id);

    Coleta getById(Integer id);

    Coleta updatePendente(Integer id);
}
