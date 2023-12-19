package br.edu.infnet.appcoleta_jdk11.model.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Coleta;

@Repository
public interface ColetaRepository extends CrudRepository<Coleta, Integer>{
	
	@Query("from Coleta c where c.coletausuario.usuarioid = :userid")
	public List<Coleta> obterLista(Integer userid);
	
}
