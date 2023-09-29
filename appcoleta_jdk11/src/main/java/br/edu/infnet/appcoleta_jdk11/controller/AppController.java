package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AppController {
	
//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping(value = "/")
	public String telaHome() {
//		return "/WEB-INF/jsp/home.jsp"; //Quando não está definido o diretório e a extensão no application.properties
		return "home";
	}
	
	@GetMapping(value = "/sobre")
	public String telaSobre() {
		return "sobre";
	}
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}

}
