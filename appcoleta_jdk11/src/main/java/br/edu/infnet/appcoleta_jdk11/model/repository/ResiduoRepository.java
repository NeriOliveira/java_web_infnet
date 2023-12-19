package br.edu.infnet.appcoleta_jdk11.model.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Residuo;

@Repository
public interface ResiduoRepository extends CrudRepository<Residuo, Integer>{
	
	@Query("from Residuo r where r.residuousuario.usuarioid = :userid")
	public List<Residuo> obterLista(Integer userid);
	
	//incluir
	
	//excluir
	
	//alterar
	
	//recuperar todos
	
	//recuperar um

}
