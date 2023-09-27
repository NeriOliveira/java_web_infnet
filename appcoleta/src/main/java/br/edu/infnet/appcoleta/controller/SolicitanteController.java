package br.edu.infnet.appcoleta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appcoleta.model.negocio.Solicitante;

@Controller
public class SolicitanteController {
	@GetMapping(value = "/solicitante/lista")
	public String telaLista(Model model) {
		
		List<Solicitante> solicitantes = new ArrayList<Solicitante>();
		
		solicitantes.add(new Solicitante("Teste 1", "123456", "teste1@teste.br"));
		solicitantes.add(new Solicitante("Teste 2", "654321", "teste2@teste.br"));
		solicitantes.add(new Solicitante("Teste 3", "456321", "teste3@teste.br"));
		solicitantes.add(new Solicitante("Teste 4", "321456", "teste4@teste.br"));
		
		model.addAttribute("listaSolicitante", solicitantes);
		
		return "solicitante/lista";
	}
}
