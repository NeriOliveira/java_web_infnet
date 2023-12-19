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
<<<<<<< Updated upstream
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nome;
    private String email;
    private String senha;
//    @OneToMany
//    @JoinColumn(name - "idUsuario")
    private List<Solicitante> solicitante;
=======
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer usuarioid;
	
    private String usuarionome;
    private String usuarioemail;
    private String usuariosenha;

	@OneToMany
    @JoinColumn(name = "solicitanteusuarioid")
    private List<Solicitante> solicitantes;
	
	@OneToMany
	@JoinColumn(name = "residuousuarioid")
	private List<Residuo> residuos;
	
	@OneToMany
	@JoinColumn(name = "coletausuarioid")
	private List<Coleta> coletas;
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
=======

	public List<Solicitante> getSolicitante() {
		return solicitantes;
	}

	public void setSolicitante(List<Solicitante> solicitantes) {
		this.solicitantes = solicitantes;
	}

	public List<Residuo> getResiduos() {
		return residuos;
	}

	public void setResiduos(List<Residuo> residuos) {
		this.residuos = residuos;
	}

    public List<Coleta> getColetas() {
		return coletas;
	}

	public void setColetas(List<Coleta> coletas) {
		this.coletas = coletas;
	}
	
>>>>>>> Stashed changes
}
