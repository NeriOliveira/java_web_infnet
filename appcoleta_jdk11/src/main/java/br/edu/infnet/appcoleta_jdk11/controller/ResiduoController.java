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
import br.edu.infnet.appcoleta_jdk11.model.service.ResiduoService;

@Controller
public class ResiduoController {
	
	@Autowired
	private ResiduoService residuoService;
	

	@GetMapping(value = "/residuo/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		
		model.addAttribute("listaResiduo", residuoService.obterLista(usuario));
		
		return "residuo/lista";
	}
	
//	@GetMapping(value = "/residuo/cadastro")
//	public String telaCadastro() {
//		return "residuo/cadastro";
//	}
	
	@GetMapping(value = "/residuo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		residuoService.excluir(id);
		
		return "redirect:/residuo/lista";
	}
	
	@PostMapping(value = "/residuo/incluir")
	public String incluir(Oleo residuo) {
		
		residuoService.incluir(residuo);
		
		return "redirect:/residuo/lista";
	}
}
