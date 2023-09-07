package br.edu.infnet.appcoleta.model.negocio;

import java.time.LocalDateTime;

public class Coleta {
	private String descricao;
	private LocalDateTime data;
	private boolean pendente;
	
	public Coleta() {
		descricao = "Pedido Inicial";
		data = LocalDateTime.now();
		pendente = true;
	}
	
	
}
