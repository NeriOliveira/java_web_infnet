package br.edu.infnet.appcoleta_jdk11.model.negocio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuarioid;
	
    private String usuarionome;
    private String usuarioemail;
    private String usuariosenha;

	@OneToMany
    @JoinColumn(name = "solicitanteusuarioid")
    private List<Solicitante> solicitante;

    public Usuario() {
		// TODO Auto-generated constructor stub
	}    
    
    public Usuario(Integer id) {
		this.setId(id);
	}    
    
    public Usuario(String email, String nome, String senha) {
    	this.setEmail(email);
        this.setNome(nome);
        this.setSenha(senha);
    }

	public String getNome() {
		return usuarionome;
	}

	public void setNome(String nome) {
		this.usuarionome = nome;
	}

	public String getSenha() {
		return usuariosenha;
	}

	public void setSenha(String cpf) {
		this.usuariosenha = cpf;
	}

	public String getEmail() {
		return usuarioemail;
	}

	public void setEmail(String email) {
		this.usuarioemail = email;
	}
	
	public Integer getId() {
		return usuarioid;
	}
	
	public void setId(Integer id) {
		this.usuarioid = id;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s; CPF: %s; E-mail: %s", getNome(), getSenha(), getEmail());
	}

	public List<Solicitante> getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(List<Solicitante> solicitante) {
		this.solicitante = solicitante;
	}
}
