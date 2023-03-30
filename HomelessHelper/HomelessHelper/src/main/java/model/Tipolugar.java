package model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


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

	private String descripcion;

	//bi-directional many-to-one association to Lugar
	@OneToMany(mappedBy="tipolugar")
	private List<Lugar> lugars;

	public Tipolugar() {
	}

	public int getIdTipolugar() {
		return this.idTipolugar;
	}

	public void setIdTipolugar(int idTipolugar) {
		this.idTipolugar = idTipolugar;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}