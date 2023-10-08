package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Solicitante;
//import br.edu.infnet.appcoleta_jdk11.model.repository.SolicitanteRepository;

@Service
public class SolicitanteService {
	
//	@Autowired
//	private SolicitanteRepository solicitanteRepository;
	
	private Map<Integer, Solicitante> mapaSolicitante = new HashMap<Integer, Solicitante>();
	private Integer id = 0;
	
	public Collection<Solicitante> obterLista(){
		return mapaSolicitante.values();
//		return (Collection<Solicitante>) solicitanteRepository.findAll();
	}
	
	public void incluir(Solicitante solicitante) {
		
		id++;
		solicitante.setId(id);
		mapaSolicitante.put(solicitante.getId(), solicitante);
		System.out.println("[Solicitante ID: " + solicitante.getId() + "] Solicitação de coleta realizada com sucesso: " + solicitante);
		
//		solicitanteRepository.save(solicitante);
	}
	
	public void excluir(Integer id) {
		mapaSolicitante.remove(id);
		
//		solicitanteRepository.deleteById(id);
	}
	
}
