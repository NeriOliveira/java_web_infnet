package br.edu.infnet.appcoleta_jdk11.model.negocio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "residuo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Residuo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
//	private float valor;
	private int codigo;
	private String observacao;
	@ManyToOne
    @JoinColumn(name = "residuousuarioid")
	private Usuario residuousuario;
	@ManyToMany(mappedBy = "residuos")
	private List<Coleta> coletas;
	
	public Residuo() {
		// TODO Auto-generated constructor stub
	}
	
	public Residuo(Integer id) {
		this.id = id;
	}
	
	public Residuo(String nome, /*float valor,*/ int codigo, String observacao) {
		setNome(nome);
//		setValor(valor);
		setCodigo(codigo);
		setObservacao(observacao);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
//	public void setValor(float valor) {
//		this.valor = valor;
//	}
//	
//	public float getValor() {
//		return valor;
//	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public String toString() { //%s = string; %d = integer; %f = float 
//		return String.format("%s; %.2f; %d", getNome(), getValor(), getCodigo());
		return String.format("%s; %d", getNome(), getCodigo());
	}

	public Usuario getUsuario() {
		return residuousuario;
	}

	public void setUsuario(Usuario usuario) {
		this.residuousuario = usuario;
	}

	public List<Coleta> getColetas() {
		return coletas;
	}

	public void setColetas(List<Coleta> coletas) {
		this.coletas = coletas;
	}
}
