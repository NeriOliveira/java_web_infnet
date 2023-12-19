package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Entulho;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.service.EntulhoService;

@Controller
public class EntulhoController {
	
	@Autowired
	private EntulhoService entulhoService;
	

	@GetMapping(value = "/entulho/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listaEntulho", entulhoService.obterLista(usuario));
		
		return "entulho/lista";
	}
	
	@GetMapping(value = "/entulho/cadastro")
	public String telaCadastro() {
		return "entulho/cadastro";
	}
	
	@GetMapping(value = "/entulho/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		entulhoService.excluir(id); 
		
		return "redirect:/entulho/lista";
	}
	
	@PostMapping(value = "/entulho/incluir")
	public String incluir(Entulho entulho) {
		
		entulhoService.incluir(entulho);
		
		return "redirect:/entulho/lista";
	}
}
