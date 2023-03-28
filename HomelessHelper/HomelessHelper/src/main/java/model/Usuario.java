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
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String email;

	private String apellidos;

	private String ciudad;

	private String clave;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nac")
	private Date fechaNac;

	private String nombre;

	//bi-directional many-to-many association to Lugar
	@ManyToMany
	@JoinTable(
		name="favoritos"
		, joinColumns={
			@JoinColumn(name="email")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_lugar")
			}
		)
	private List<Lugar> lugars1;

	//bi-directional many-to-one association to Lugar
	@OneToMany(mappedBy="usuario")
	private List<Lugar> lugars2;

	public Usuario() {
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

	public List<Lugar> getLugars1() {
		return this.lugars1;
	}

	public void setLugars1(List<Lugar> lugars1) {
		this.lugars1 = lugars1;
	}

	public List<Lugar> getLugars2() {
		return this.lugars2;
	}

	public void setLugars2(List<Lugar> lugars2) {
		this.lugars2 = lugars2;
	}

	public Lugar addLugars2(Lugar lugars2) {
		getLugars2().add(lugars2);
		lugars2.setUsuario(this);

		return lugars2;
	}

	public Lugar removeLugars2(Lugar lugars2) {
		getLugars2().remove(lugars2);
		lugars2.setUsuario(null);

		return lugars2;
	}

}