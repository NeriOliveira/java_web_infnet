package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Entulho;
import br.edu.infnet.appcoleta_jdk11.model.service.EntulhoService;

@Controller
public class EntulhoController {
	
	@Autowired
	private EntulhoService entulhoService;
	

	@GetMapping(value = "/entulho/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listaEntulho", entulhoService.obterLista());
		
		return "entulho/lista";
	}
	
	@GetMapping(value = "/entulho/cadastro")
	public String telaCadastro() {
		return "entulho/cadastro";
	}
	
	@GetMapping(value = "/entulho/{codigo}/excluir")
	public String exclusao(@PathVariable Integer codigo) {
		
		entulhoService.excluir(codigo);
		
		return "redirect:/entulho/lista";
	}
	
	@PostMapping(value = "/entulho/incluir")
	public String incluir(Entulho entulho) {
		
		entulhoService.incluir(entulho);
		
		return "redirect:/entulho/lista";
	}
}
