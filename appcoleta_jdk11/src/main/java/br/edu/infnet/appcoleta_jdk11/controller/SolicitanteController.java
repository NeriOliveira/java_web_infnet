package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Solicitante;
import br.edu.infnet.appcoleta_jdk11.model.service.SolicitanteService;

@Controller
public class SolicitanteController {
	
	@Autowired
	private SolicitanteService solicitanteService;

	@GetMapping(value = "/solicitante/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listaSolicitante", solicitanteService.obterLista());
		
		return "solicitante/lista";
	}
	
	@GetMapping(value = "/solicitante/cadastro")
	public String telaCadastro() {
		return "solicitante/cadastro";
	}
	
	@GetMapping(value = "/solicitante/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		solicitanteService.excluir(id);
		
		return "redirect:/solicitante/lista";
	}
	
	@PostMapping(value = "/solicitante/incluir")
	public String incluir(Solicitante solicitante) {
		
		solicitanteService.incluir(solicitante);
		
		return "redirect:/solicitante/lista";
	}
}
