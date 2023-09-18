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
	
	public Reciclavel(String nome, int codigo, String observacao, float peso, boolean isLimpo, ReciclavelTipo tipo) {
		super(nome, codigo, observacao);
		setPeso(peso);
		setLimpo(isLimpo);
		setTipo(tipo);
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
	
	@Override
	public String toString() {
		return String.format("Tipo: %s; Peso: %.2f kg; Está limpo? %s", getTipo(), getPeso(), isLimpo());
	}
	
	public static ReciclavelTipo valueOf(String s) {
		ReciclavelTipo tipo = null;
    	switch (s) {
        case "Madeira":  
        	tipo = ReciclavelTipo.Madeira;
            break;
        case "Metal":
        	tipo = ReciclavelTipo.Metal;
            break;
        case "Papel":  
        	tipo = ReciclavelTipo.Papel;
            break;
        case "Plastico":  
        	tipo = ReciclavelTipo.Plastico;
        	break;
        case "Vidro":  
        	tipo = ReciclavelTipo.Vidro;
        	break;
        default: 
            System.out.println("Tipo inválido. Digite o tipo sem acento e com a primeira letra maiúscula.");
            break;
    	}
        return tipo;
    }
}
