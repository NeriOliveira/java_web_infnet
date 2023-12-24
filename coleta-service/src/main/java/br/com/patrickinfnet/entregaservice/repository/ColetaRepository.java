package br.com.patrickinfnet.entregaservice.repository;

import br.com.patrickinfnet.entregaservice.model.Coleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColetaRepository  extends JpaRepository<Coleta, Integer> {
}
