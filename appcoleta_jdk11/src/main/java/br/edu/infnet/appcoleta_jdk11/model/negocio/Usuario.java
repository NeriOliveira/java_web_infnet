package br.edu.infnet.appcoleta_jdk11.model.negocio;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

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
	
	@Override
	public String toString() {
		return String.format("Nome: %s; CPF: %s; E-mail: %s", getNome(), getSenha(), getEmail());
	}
}