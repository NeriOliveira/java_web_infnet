package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Residuo;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.repository.ResiduoRepository;

@Service
public class ResiduoService {
	
	@Autowired
	private ResiduoRepository residuoRepository;
	
	public Collection<Residuo> obterLista(){
		return (Collection<Residuo>) residuoRepository.findAll();
	}
	
	public Collection<Residuo> obterLista(Usuario usuario){
		return (Collection<Residuo>) residuoRepository.obterLista(usuario.getId());
	}
	
	public void incluir(Residuo residuo) {
		residuoRepository.save(residuo);
	}
	
	public void excluir(Integer id) {
		residuoRepository.deleteById(id);
	}
	
}
