 package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

<<<<<<< Updated upstream
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
//import br.edu.infnet.appcoleta_jdk11.model.repository.SolicitanteRepository;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.repository.UsuarioRepository;
>>>>>>> Stashed changes

@Service
public class UsuarioService {
	
//	@Autowired
//	private UsuarioRepository usuarioRepository;
	
	private Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();
<<<<<<< Updated upstream
	private Integer id = 0;
	
	public Collection<Usuario> obterLista(){
//		return (Collection<Usuario>) usuarioRepository.findAll();
		return mapaUsuario.values();
	}
	
	public void incluir(Usuario usuario) {
		
//		usuarioRepository.save(usuario);
		
		id++;
		usuario.setId(id);
//		mapaUsuario.put(usuario.getId(), usuario);
		mapaUsuario.put(usuario.getEmail(), usuario);
		System.out.println("[Usuário " + usuario.getId() + "] Cadastro de usuário realizado com sucesso: " + usuario);
	}
	
	public void excluir(String email) {
		
//		Usuario user = usuarioRepository.findEmail(email);	
//		usuarioRepository.deleteById(id);
	
		mapaUsuario.remove(email);
=======
	
	public Collection<Usuario> obterLista(){
		return (Collection<Usuario>) usuarioRepository.findAll();
	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
		mapaUsuario.put(usuario.getEmail(), usuario);
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
>>>>>>> Stashed changes
	}
	
	public Usuario validar(String email, String senha) {
		Usuario usuario = mapaUsuario.get(email);
		if(usuario != null) {
			if(senha.equalsIgnoreCase(usuario.getSenha())) {
				return usuario;
			}
		}
		return null;
	}
	
	
	
}
