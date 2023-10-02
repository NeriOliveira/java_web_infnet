package br.edu.infnet.appcoleta_jdk11.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel;

@Controller
public class ReciclavelController {
	
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
	

	@GetMapping(value = "/reciclavel/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listaReciclavel", obterLista());
		
		return "reciclavel/lista";
	}
	
	@GetMapping(value = "/reciclavel/{codigo}/excluir")
	public String exclusao(@PathVariable int codigo) {
		
        excluir(codigo);
		
		return "redirect:/reciclavel/lista";
	}
}
