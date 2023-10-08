package br.edu.infnet.appcoleta_jdk11.model.negocio;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name = "TSolicitante")
public class Solicitante {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    private String nome;
    private String cpf;
    private String email;

    public Solicitante() {
		// TODO Auto-generated constructor stub
	}    
    
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
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s; CPF: %s; E-mail: %s", getNome(), getCpf(), getEmail());
	}

}
