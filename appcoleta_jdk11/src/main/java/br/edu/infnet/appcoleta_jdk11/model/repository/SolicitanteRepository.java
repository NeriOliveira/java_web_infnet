package br.edu.infnet.appcoleta_jdk11.model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Solicitante;

@Repository
public interface SolicitanteRepository extends CrudRepository<Solicitante, Integer>{
	
	@Query("from Solicitante s where s.solicitanteusuario.usuarioid = :userid")
	public List<Solicitante> obterLista(Integer userid);
	
	//incluir
	
	//excluir
	
	//alterar
	
	//recuperar todos
	
	//recuperar um

}