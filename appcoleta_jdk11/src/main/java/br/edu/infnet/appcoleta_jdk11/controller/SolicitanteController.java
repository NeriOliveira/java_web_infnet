package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appcoleta_jdk11.SolicitanteLoader;

@Controller
public class SolicitanteController {
	
	@Autowired
	private SolicitanteLoader solicitanteLoader;

	@GetMapping(value = "/solicitante/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listaSolicitante", solicitanteLoader.obterLista());
		
		return "solicitante/lista";
	}
}
