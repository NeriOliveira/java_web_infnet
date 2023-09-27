package br.edu.infnet.appcoleta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {
	
//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping(value = "/")
	public String telaHome() {
//		return "/WEB-INF/jsp/home.jsp"; //Quando não está definido o diretório e a extensão no application.properties
		return "home";
	}

}
