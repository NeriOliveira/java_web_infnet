package br.edu.infnet.appcoleta_jdk11.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Oleo;

@Controller
public class OleoController {
	
	private Map<Integer, Oleo> mapaOleo = new HashMap<Integer, Oleo>();
	
	public Collection<Oleo> obterLista(){
		return mapaOleo.values();
	}
	
	public void incluir(Oleo oleo) {
		mapaOleo.put(oleo.getCodigo(), oleo);
		System.out.println("[Óleo " + oleo.getCodigo() + "] Solicitação de coleta realizada com sucesso: " + oleo);
	}
	
	public void excluir(Integer codigo) {
		mapaOleo.remove(codigo);
	}
	

	@GetMapping(value = "/oleo/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listaOleo", obterLista());
		
		return "oleo/lista";
	}
	
	@GetMapping(value = "/oleo/{codigo}/excluir")
	public String exclusao(@PathVariable Integer codigo) {
		
        excluir(codigo);
		
		return "redirect:/oleo/lista";
	}
}
