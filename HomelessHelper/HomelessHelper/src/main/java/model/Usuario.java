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
	//@Column(length = 20, nullable = false)
	private String clave;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nac")
	private Date fechaNac;

	private String nombre;

	//bi-directional many-to-one association to Lugar
	@OneToMany(mappedBy="usuario")
	private List<Lugar> lugars;

	public Usuario() {
	}

	// Constuctor de Cuenta de kotlin 
	public Usuario(String email,  String clave, String nombre) {
		super();
		this.email = email;
		this.clave = clave;
		this.nombre = nombre;
		
	}
	
	public String getEmail() {
		return this.email;
	}
	
	

	public Usuario(String email, String apellidos, String ciudad, String clave, Date fechaNac, String nombre) {
		super();
		this.email = email;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.clave = clave;
		this.fechaNac = fechaNac;
		this.nombre = nombre;
		
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

	public Lugar addLugar(Lugar lugar) {
		getLugars().add(lugar);
		lugar.setUsuario(this);

		return lugar;
	}

	public Lugar removeLugar(Lugar lugar) {
		getLugars().remove(lugar);
		lugar.setUsuario(null);

		return lugar;
	}

}
	