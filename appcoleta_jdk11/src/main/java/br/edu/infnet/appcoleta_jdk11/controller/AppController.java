package br.edu.infnet.appcoleta_jdk11.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.support.SessionStatus;


@Controller
public class AppController {
	
	@GetMapping(value = "/")
	public String telaHome() {
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
	
	@GetMapping(value = "/logout")
	public String telaLogout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("user");
		return "home";
	}

}
