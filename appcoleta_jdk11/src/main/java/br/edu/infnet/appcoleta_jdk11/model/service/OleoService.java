package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Oleo;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.repository.OleoRepository;

@Service
public class OleoService {
	
	@Autowired
	private OleoRepository oleoRepository;
	
	public Collection<Oleo> obterLista(){
		return (Collection<Oleo>) oleoRepository.findAll();
	}
	
	public Collection<Oleo> obterLista(Usuario usuario){
		return (Collection<Oleo>) oleoRepository.obterLista(usuario.getId());
	}
	
	public void incluir(Oleo oleo) {
		oleoRepository.save(oleo);
	}
	
	public void excluir(Integer id) {
		oleoRepository.deleteById(id);
	}
	
}
