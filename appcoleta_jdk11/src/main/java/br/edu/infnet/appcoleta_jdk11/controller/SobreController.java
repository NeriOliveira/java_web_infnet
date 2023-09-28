package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SobreController {
	
//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping(value = "/sobre")
	public String telaHome() {
//		return "/WEB-INF/jsp/home.jsp"; //Quando não está definido o diretório e a extensão no application.properties
		return "sobre";
	}

}
