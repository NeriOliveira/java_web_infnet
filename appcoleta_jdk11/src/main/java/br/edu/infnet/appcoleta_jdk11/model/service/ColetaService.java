package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Coleta;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.repository.ColetaRepository;

@Service
public class ColetaService {
	
	@Autowired
	private ColetaRepository coletaRepository;
	
	public Collection<Coleta> obterLista(){
		return (Collection<Coleta>) coletaRepository.findAll();
	}
	
	public Collection<Coleta> obterLista(Usuario usuario){
		return (Collection<Coleta>) coletaRepository.obterLista(usuario.getId());
	}
	
	public void incluir(Coleta coleta) {
		coletaRepository.save(coleta);
	}
	
	public void excluir(Integer id) {
		coletaRepository.deleteById(id);
	}
}
