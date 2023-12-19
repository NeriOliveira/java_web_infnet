package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.repository.ReciclavelRepository;

@Service
public class ReciclavelService {
	
	@Autowired
	private ReciclavelRepository reciclavelRepository;
	
	public Collection<Reciclavel> obterLista(){
		return (Collection<Reciclavel>) reciclavelRepository.findAll();
	}
	
	public Collection<Reciclavel> obterLista(Usuario usuario){
		return (Collection<Reciclavel>) reciclavelRepository.obterLista(usuario.getId());
	}
	
	public void incluir(Reciclavel reciclavel) {
		reciclavelRepository.save(reciclavel);
	}
	
	public void excluir(Integer id) {
		reciclavelRepository.deleteById(id);
	}
	
}
