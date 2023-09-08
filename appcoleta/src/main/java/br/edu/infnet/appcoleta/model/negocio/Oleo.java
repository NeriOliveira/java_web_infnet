package br.edu.infnet.appcoleta.model.negocio;

public class Oleo extends Residuo{
	public enum OleoTipo{
		Cozinha, Automotivo, Termico, Hidraulico, Outro;
	}
	
	private float peso;
	private boolean isLimpo;
	private OleoTipo tipo;
	
	public Oleo() {
		// TODO Auto-generated constructor stub
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public boolean isLimpo() {
		return isLimpo;
	}

	public void setLimpo(boolean isLimpo) {
		this.isLimpo = isLimpo;
	}

	public OleoTipo getTipo() {
		return tipo;
	}

	public void setTipo(OleoTipo tipo) {
		this.tipo = tipo;
	}
	
	
}
