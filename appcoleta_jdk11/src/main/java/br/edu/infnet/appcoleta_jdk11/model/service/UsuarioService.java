package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
//import br.edu.infnet.appcoleta_jdk11.model.repository.SolicitanteRepository;

@Service
public class UsuarioService {
	
//	@Autowired
//	private UsuarioRepository usuarioRepository;
	
	private Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();
	
	public Collection<Usuario> obterLista(){
//		return (Collection<Usuario>) usuarioRepository.findAll();
		return mapaUsuario.values();
	}
	
	public void incluir(Usuario usuario) {
		
//		usuarioRepository.save(usuario);
		
		mapaUsuario.put(usuario.getEmail(), usuario);
		System.out.println("[Usuário " + usuario.getEmail() + "] Cadastro de usuário realizado com sucesso: " + usuario);
	}
	
	public void excluir(String email) {
		
//		Usuario user = usuarioRepository.findEmail(email);	
//		usuarioRepository.deleteById(id);
	
		mapaUsuario.remove(email);
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
