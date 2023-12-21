package br.edu.infnet.appcoleta_jdk11.model.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	@Query("from Usuario u where u.usuarioid = :userid")
	public List<Usuario> obterLista(Integer userid);

}

