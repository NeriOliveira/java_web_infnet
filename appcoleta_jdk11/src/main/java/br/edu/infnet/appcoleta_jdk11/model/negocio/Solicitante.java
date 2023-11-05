package br.edu.infnet.appcoleta_jdk11.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "solicitante")
public class Solicitante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer solicitanteid;
	
    private String solicitantenome;
    private String solicitantecpf;
    private String solicitanteemail;
    
    @ManyToOne
    @JoinColumn(name = "solicitanteusuarioid")
    private Usuario solicitanteusuario;

    public Solicitante() {
		// TODO Auto-generated constructor stub
	}    
    
    public Solicitante(String nome, String cpf, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEmail(email);
    }

	public String getNome() {
		return solicitantenome;
	}

	public void setNome(String nome) {
		this.solicitantenome = nome;
	}

	public String getCpf() {
		return solicitantecpf;
	}

	public void setCpf(String cpf) {
		this.solicitantecpf = cpf;
	}

	public String getEmail() {
		return solicitanteemail;
	}

	public void setEmail(String email) {
		this.solicitanteemail = email;
	}
	
	public Integer getId() {
		return solicitanteid;
	}
	
	public void setId(Integer id) {
		this.solicitanteid = id;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s; CPF: %s; E-mail: %s", getNome(), getCpf(), getEmail());
	}

	public Usuario getUsuario() {
		return solicitanteusuario;
	}

	public void setUsuario(Usuario usuario) {
		this.solicitanteusuario = usuario;
	}

}
