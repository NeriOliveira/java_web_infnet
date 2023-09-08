package br.edu.infnet.appcoleta.model.negocio;


public class Entulho extends Residuo{
	
	public enum EntulhoClasse{
		A, B, C, D;
		
//	Classe A: resíduos recicláveis e passíveis de reutilização tais como: tijolos, blocos, telhas, placas de revestimento, argamassa e concreto;
		
//	Classe B: resíduos recicláveis formados por plásticos, papéis, metais, vidros e madeiras em geral, incluindo gesso;
		
//	Classe C: resíduos que não são passiveis de reciclagem ou recuperação por não possuir tecnologia desenvolvida para isso;
		
//	Classe D: resíduos perigosos, tais como: tintas, solventes, óleos, amianto, produtos de demolições, reformas e reparos em clínicas 
//			radiológicas, instalações industriais e outras.
	}
	
	private float volume;
	private boolean isObra;
	private EntulhoClasse classe;
	
	public Entulho() {

	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public boolean isObra() {
		return isObra;
	}

	public void setObra(boolean isObra) {
		this.isObra = isObra;
	}

	public EntulhoClasse getClasse() {
		return classe;
	}

	public void setClasse(EntulhoClasse classe) {
		this.classe = classe;
	}
	
}
