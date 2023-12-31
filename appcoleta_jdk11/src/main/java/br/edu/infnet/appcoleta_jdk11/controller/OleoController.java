package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Oleo;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.service.OleoService;

@Controller
public class OleoController {
	
	@Autowired
	private OleoService oleoService;
	

	@GetMapping(value = "/oleo/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listaOleo", oleoService.obterLista(usuario));
		
		return "oleo/lista";
	}
	
	@GetMapping(value = "/oleo/cadastro")
	public String telaCadastro() {
		return "oleo/cadastro";
	}
	
	@GetMapping(value = "/oleo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		oleoService.excluir(id);
		
		return "redirect:/oleo/lista";
	}
	
	@PostMapping(value = "/oleo/incluir")
	public String incluir(Oleo oleo) {
		
		oleoService.incluir(oleo);
		
		return "redirect:/oleo/lista";
	}
}
