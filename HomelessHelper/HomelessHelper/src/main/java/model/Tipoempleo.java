package model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipoempleo database table.
 * 
 */
@Entity
@NamedQuery(name="Tipoempleo.findAll", query="SELECT t FROM Tipoempleo t")
public class Tipoempleo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	//bi-directional many-to-one association to Empleo
	@OneToMany(mappedBy="tipoempleo")
	private List<Empleo> empleos;

	public Tipoempleo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Empleo> getEmpleos() {
		return this.empleos;
	}

	public void setEmpleos(List<Empleo> empleos) {
		this.empleos = empleos;
	}

	public Empleo addEmpleo(Empleo empleo) {
		getEmpleos().add(empleo);
		empleo.setTipoempleo(this);

		return empleo;
	}

	public Empleo removeEmpleo(Empleo empleo) {
		getEmpleos().remove(empleo);
		empleo.setTipoempleo(null);

		return empleo;
	}

}