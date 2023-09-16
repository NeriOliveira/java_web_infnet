package br.edu.infnet.appcoleta.model.negocio;

public class Solicitante {
    private String nome;
    private String cpf;
    private String email;

    public Solicitante(String nome, String cpf, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s; CPF: %s; E-mail: %s", getNome(), getCpf(), getEmail());
	}
}
