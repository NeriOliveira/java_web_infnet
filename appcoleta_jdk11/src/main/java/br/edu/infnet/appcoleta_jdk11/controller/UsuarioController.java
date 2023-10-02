package br.edu.infnet.appcoleta_jdk11.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.appcoleta_jdk11.model.negocio.Usuario;
import br.edu.infnet.appcoleta_jdk11.model.service.UsuarioService;

@SessionAttributes("user")
@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario/cadastro")
	public String telaCadastro() {
		return "usuario/cadastro";
	}

	@GetMapping(value = "/usuario/lista")
	public String telaLista(Model model) {
		
		model.addAttribute("listaUsuario", usuarioService.obterLista());
		
		return "usuario/lista";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		
		usuarioService.incluir(usuario);
		
		return "redirect:/";
	}
	
	@GetMapping(value = "/usuario/{email}/excluir")
	public String excluir(@PathVariable String email) {
		
		usuarioService.excluir(email);
		
		return "redirect:/usuario/lista";
	}
	
	
	@PostMapping(value = "/valida")
	public String validar(Model model, @RequestParam String email, @RequestParam String senha) {		
		Usuario user = usuarioService.validar(email,senha);
		if(user != null) {
			model.addAttribute("user", user);
			return "home";
		}
		
		return "redirect:/";
	}
}
