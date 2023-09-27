package br.edu.infnet.appcoleta_jdk11.model.negocio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Coleta {
	private String descricao;
	private LocalDateTime data;
	private boolean pendente;
	private Solicitante solicitante;
	private List<Residuo> residuos;
	
	public Coleta() {
		descricao = "Pedido de Coleta";
		data = LocalDateTime.now();
		pendente = true;
	}
	
	public Coleta(String descricao, Solicitante solicitante, ArrayList<Residuo> residuos) {
		this();
		this.descricao = descricao;
		this.solicitante = solicitante;
		this.residuos = residuos;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isPendente() {
		return pendente;
	}

	public void setPendente(boolean pendente) {
		this.pendente = pendente;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public List<Residuo> getResiduos() {
		return residuos;
	}

	public void setResiduos(List<Residuo> residuos) {
		this.residuos = residuos;
	}

	@Override
	public String toString() {
		return descricao + ";" + data + ";" + pendente + ";" + solicitante + ";" + residuos.size();
		
	}
	
}
