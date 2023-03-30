package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the lugar database table.
 * 
 */
@Entity
@NamedQuery(name="Lugar.findAll", query="SELECT l FROM Lugar l")
public class Lugar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_lugar")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLugar;

	private Object descripcion;

	@Column(name="email_responsable")
	private String emailResponsable;

	private int telefono;

	private String ubicacion;

	private int valoracion;

	//bi-directional many-to-one association to Tipolugar
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="id_tipolugar")
	private Tipolugar tipolugar;

	public Lugar() {
	}

	public int getIdLugar() {
		return this.idLugar;
	}

	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}

	public Object getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(Object descripcion) {
		this.descripcion = descripcion;
	}

	public String getEmailResponsable() {
		return this.emailResponsable;
	}

	public void setEmailResponsable(String emailResponsable) {
		this.emailResponsable = emailResponsable;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getValoracion() {
		return this.valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public int getTipolugar() {
		return this.tipolugar.getIdTipolugar();
	}

	public void setTipolugar(Tipolugar tipolugar) {
		this.tipolugar = tipolugar;
	}

}