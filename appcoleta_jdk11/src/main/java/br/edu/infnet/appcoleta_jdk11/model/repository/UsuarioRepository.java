package br.edu.infnet.appcoleta_jdk11.model.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}

