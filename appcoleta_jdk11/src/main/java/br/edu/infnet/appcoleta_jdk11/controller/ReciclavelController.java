package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Reciclavel;
import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.service.ReciclavelService;

@Controller
public class ReciclavelController {
	
	@Autowired
	private ReciclavelService reciclavelService;
	

	@GetMapping(value = "/reciclavel/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listaReciclavel", reciclavelService.obterLista(usuario));
		
		return "reciclavel/lista";
	}
	
	@GetMapping(value = "/reciclavel/cadastro")
	public String telaCadastro() {
		return "reciclavel/cadastro";
	}

	@GetMapping(value = "/reciclavel/{id}/excluir")
	public String exclusao(@PathVariable int id) {
		
		reciclavelService.excluir(id);
		
		return "redirect:/reciclavel/lista";
	}
	
	@PostMapping(value = "/reciclavel/incluir")
	public String incluir(Reciclavel reciclavel) {
		
		reciclavelService.incluir(reciclavel);
		
		return "redirect:/reciclavel/lista";
	}
}
