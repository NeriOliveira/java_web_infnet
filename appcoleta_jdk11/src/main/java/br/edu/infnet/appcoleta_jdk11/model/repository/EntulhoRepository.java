package br.edu.infnet.appcoleta_jdk11.model.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Entulho;

@Repository
public interface EntulhoRepository extends CrudRepository<Entulho, Integer>{
	
	@Query("from Entulho e where e.residuousuario.usuarioid = :userid")
	public List<Entulho> obterLista(Integer userid);
	
	//incluir
	
	//excluir
	
	//alterar
	
	//recuperar todos
	
	//recuperar um

}
