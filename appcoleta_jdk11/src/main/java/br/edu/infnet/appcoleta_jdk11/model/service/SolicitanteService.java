package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Solicitante;

@Service
public class SolicitanteService {
private Map<String, Solicitante> mapaSolicitante = new HashMap<String, Solicitante>();
	
	public Collection<Solicitante> obterLista(){
		return mapaSolicitante.values();
	}
	
	public void incluir(Solicitante solicitante) {
		mapaSolicitante.put(solicitante.getCpf(), solicitante);
		System.out.println("[Solicitante " + solicitante.getCpf() + "] Solicitação de coleta realizada com sucesso: " + solicitante);
	}
	
	public void excluir(String cpf) {
		mapaSolicitante.remove(cpf);
	}
	
}
