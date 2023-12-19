package br.edu.infnet.appcoleta_jdk11.model.negocio;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "oleo")
public class Oleo extends Residuo{
	
	public enum OleoTipo{
		Cozinha, Automotivo, Termico, Hidraulico, Outro;
	}
	
	private float volume;
	private boolean isLimpo;
	private OleoTipo tipo;
	
	public Oleo() {
		// TODO Auto-generated constructor stub
	}
	
	public Oleo(Integer id) {
		super(id);
	}
	
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
		return String.format("{ÓLEO: Tipo: %s; Volume: %.2f litro(s); Está limpo? %s}", getTipo(), getVolume(), isLimpo());
	}
	
    public static OleoTipo valueOf(String s) {
    	OleoTipo tipo = null;
    	switch (s) {
        case "Automotivo":  
        	tipo = OleoTipo.Automotivo;
            break;
        case "Cozinha":
        	tipo = OleoTipo.Cozinha;
            break;
        case "Hidraulico":  
        	tipo = OleoTipo.Hidraulico;
            break;
        case "Outro":  
        	tipo = OleoTipo.Outro;
        	break;
        case "Termico":  
        	tipo = OleoTipo.Termico;
        	break;
        default: 
            System.out.println("Tipo inválido. Digite o tipo sem acento e com a primeira letra maiúscula.");
            break;
    	}
        return tipo;
    }
	
}
