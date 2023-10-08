package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Coleta;
import br.edu.infnet.appcoleta_jdk11.model.service.ColetaService;

@Controller
public class ColetaController {
	
	@Autowired
	private ColetaService coletaService;
	

	@GetMapping(value = "/coleta/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listaColeta", coletaService.obterLista());
		
		return "coleta/lista";
	}
	
	@GetMapping(value = "/coleta/cadastro")
	public String telaCadastro() {
		return "coleta/cadastro";
	}
	
	@GetMapping(value = "/coleta/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		coletaService.excluir(id);
		
		return "redirect:/coleta/lista";
	}
	
	@PostMapping(value = "/coleta/incluir")
	public String incluir(Coleta coleta) {
		
		coletaService.incluir(coleta);
		
		return "redirect:/coleta/lista";
	}
}
