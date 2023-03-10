package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the tipolugar database table.
 * 
 */
@Entity
@NamedQuery(name="Tipolugar.findAll", query="SELECT t FROM Tipolugar t")
public class Tipolugar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipolugar")
	private int idTipolugar;

	private String requisitos;

	//bi-directional one-to-one association to Lugar
	@OneToOne
	@JoinColumn(name="id_tipolugar")
	private Lugar lugar;

	public Tipolugar() {
	}

	public int getIdTipolugar() {
		return this.idTipolugar;
	}

	public void setIdTipolugar(int idTipolugar) {
		this.idTipolugar = idTipolugar;
	}

	public String getRequisitos() {
		return this.requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public Lugar getLugar() {
		return this.lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

}