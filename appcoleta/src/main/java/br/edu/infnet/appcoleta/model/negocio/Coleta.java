package br.edu.infnet.appcoleta.model.negocio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Coleta {
	private String descricao;
	private LocalDateTime data;
	private boolean pendente;
	private Solicitante solicitante;
	private List<Residuo> residuos;
	
	public Coleta(Solicitante solicitante, List<Residuo> residuos) {
		
		descricao = "Pedido Inicial";
		data = LocalDateTime.now();
		pendente = true;
		this.solicitante = solicitante;
		this.residuos = residuos;
	}
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + pendente + ";" + solicitante + ";" + residuos.size();
		
	}
	
}
