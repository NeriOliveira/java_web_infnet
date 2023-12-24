package br.edu.infnet.appcoleta_jdk11.model.negocio;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "coleta")
public class Coleta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	private boolean pendente;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name="coletasolicitanteid")
	private Solicitante solicitante;
	@ManyToMany(cascade = CascadeType.DETACH)
	
	private List<Residuo> residuos;
	
    @ManyToOne
    @JoinColumn(name = "coletausuarioid")
    private Usuario coletausuario;
	
	
	public Coleta() {
		descricao = "Pedido de Coleta";
		data = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
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

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Usuario getUsuario() {
		return coletausuario;
	}

	public void setUsuario(Usuario usuario) {
		this.coletausuario = usuario;
	}
	
	@Override
	public String toString() {
		return descricao + ";" + data + ";" + pendente + ";" + solicitante + ";" + residuos.size();
		
	}
	
}
