package br.edu.infnet.appcoleta.model.negocio;

public class Oleo extends Residuo{
	
	public enum OleoTipo{
		Cozinha, Automotivo, Termico, Hidraulico, Outro;
	}
	
	private float volume;
	private boolean isLimpo;
	private OleoTipo tipo;
	
	public Oleo(String nome, int codigo, String observacao, float volume, boolean isLimpo, OleoTipo tipo) {
		super(nome, codigo, observacao);
		setVolume(volume);
		setLimpo(isLimpo);
		setTipo(tipo);
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float peso) {
		this.volume = peso;
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
	
	@Override
	public String toString() {
		return String.format("Tipo: %s; Volume: %.2f litro(s); Está limpo? %s", getTipo(), getVolume(), isLimpo());
	}
	
}
