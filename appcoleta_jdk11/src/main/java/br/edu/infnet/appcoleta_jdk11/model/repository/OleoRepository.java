package br.edu.infnet.appcoleta_jdk11.model.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Oleo;

@Repository
public interface OleoRepository extends CrudRepository<Oleo, Integer>{
	
	@Query("from Oleo o where o.residuousuario.usuarioid = :userid")
	public List<Oleo> obterLista(Integer userid);
	
	//incluir
	
	//excluir
	
	//alterar
	
	//recuperar todos
	
	//recuperar um

}
