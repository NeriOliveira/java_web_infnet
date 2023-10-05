package br.edu.infnet.appcoleta_jdk11.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel;

@Service
public class ReciclavelService {
	
	private Map<Integer, Reciclavel> mapaReciclavel = new HashMap<Integer, Reciclavel>();
	
	public Collection<Reciclavel> obterLista(){
		return mapaReciclavel.values();
	}
	
	public void incluir(Reciclavel reciclavel) {
		mapaReciclavel.put(reciclavel.getCodigo(), reciclavel);
		System.out.println("[Reciclável " + reciclavel.getCodigo() + "] Solicitação de coleta realizada com sucesso: " + reciclavel.toString());
	}
	
	public void excluir(int codigo) {
		mapaReciclavel.remove(codigo);
	}
	
}
