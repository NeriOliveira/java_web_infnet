package br.edu.infnet.appcoleta.model.negocio;

public class Reciclavel extends Residuo{
	
	public enum ReciclavelTipo{
		Papel, Metal, Plastico, Vidro, Madeira, 
	}
	
	private float peso;
	private boolean isLimpo;
	private ReciclavelTipo tipo;
	
	public Reciclavel() {
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

	public ReciclavelTipo getTipo() {
		return tipo;
	}

	public void setTipo(ReciclavelTipo tipo) {
		this.tipo = tipo;
	}
	
}
