package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Entulho;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.repository.EntulhoRepository;

@Service
public class EntulhoService {
	
	@Autowired
	private EntulhoRepository entulhoRepository;
	
	public Collection<Entulho> obterLista(){
		return (Collection<Entulho>) entulhoRepository.findAll();
	}
	
	public Collection<Entulho> obterLista(Usuario usuario){
		return (Collection<Entulho>) entulhoRepository.obterLista(usuario.getId());
	}
	
	public void incluir(Entulho entulho) {
		entulhoRepository.save(entulho);
	}
	
	public void excluir(Integer id) {
		entulhoRepository.deleteById(id);
	}
	
}
