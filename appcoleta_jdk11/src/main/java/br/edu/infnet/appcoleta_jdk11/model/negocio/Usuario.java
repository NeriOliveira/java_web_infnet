package br.edu.infnet.appcoleta_jdk11.model.negocio;

import java.util.List;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name = "TSolicitante")
public class Usuario {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nome;
    private String email;
    private String senha;
//    @OneToMany
//    @JoinColumn(name - "idUsuario")
    private List<Solicitante> solicitante;

    public Usuario() {
		// TODO Auto-generated constructor stub
	}    
    
    public Usuario(String email, String nome, String senha) {
    	this.setEmail(email);
        this.setNome(nome);
        this.setSenha(senha);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String cpf) {
		this.senha = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s; CPF: %s; E-mail: %s", getNome(), getSenha(), getEmail());
	}
}
