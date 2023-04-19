package model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", apellidos=" + apellidos + ", ciudad=" + ciudad + ", clave=" + clave
				+ ", fechaNac=" + fechaNac + ", nombre=" + nombre + ", lugars=" + lugars + "]";
	}

	private static final long serialVersionUID = 1L;
	@Id
	private String email;
	private String apellidos;
	private String ciudad;
	private String clave;
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nac")
	private Date fechaNac;
	private String nombre;
	// bi-directional many-to-one association to Lugar
	@OneToMany(mappedBy = "emailResponsable")
	private List<Lugar> lugars;

	public Usuario() {
	}

	public Usuario(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFechaNac() {
		return this.fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Lugar> getLugars() {
		return this.lugars;
	}

	public void setLugars(List<Lugar> lugars) {
		this.lugars = lugars;
	}

}