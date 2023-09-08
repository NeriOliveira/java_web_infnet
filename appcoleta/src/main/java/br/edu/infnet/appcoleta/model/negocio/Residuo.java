package br.edu.infnet.appcoleta.model.negocio;

public class Residuo {
	private String nome;
	private float valor;
	private int codigo;
	private String observacao;
	
	public Residuo() {
		// TODO Auto-generated constructor stub
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return valor;
	}
	
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
}
