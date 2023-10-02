package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;

@Service
public class UsuarioService {
	
	private Map<String, Usuario> mapaUsuario = new HashMap<String, Usuario>();
	
	public Collection<Usuario> obterLista(){
		return mapaUsuario.values();
	}
	
	public void incluir(Usuario usuario) {
		mapaUsuario.put(usuario.getEmail(), usuario);
		System.out.println("[Usuário " + usuario.getEmail() + "] Cadastro de usuário realizado com sucesso: " + usuario);
	}
	
	public void excluir(String email) {
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
