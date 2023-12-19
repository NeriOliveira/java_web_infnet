package br.edu.infnet.appcoleta_jdk11.model.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel;

@Repository
public interface ReciclavelRepository extends CrudRepository<Reciclavel, Integer>{
	
	@Query("from Reciclavel r where r.residuousuario.usuarioid = :userid")
	public List<Reciclavel> obterLista(Integer userid);
	
}
