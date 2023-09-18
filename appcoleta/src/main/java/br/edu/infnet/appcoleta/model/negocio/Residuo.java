package br.edu.infnet.appcoleta.model.negocio;

public abstract class Residuo {
	private String nome;
//	private float valor;
	private int codigo;
	private String observacao;
	
	public Residuo() {
		// TODO Auto-generated constructor stub
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
	
	@Override
	public String toString() { //%s = string; %d = integer; %f = float 
//		return String.format("%s; %.2f; %d", getNome(), getValor(), getCodigo());
		return String.format("%s; %d", getNome(), getCodigo());
	}
}
