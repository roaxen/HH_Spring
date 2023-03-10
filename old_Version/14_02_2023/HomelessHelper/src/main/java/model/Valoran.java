package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the valoran database table.
 * 
 */
@Entity
@NamedQuery(name="Valoran.findAll", query="SELECT v FROM Valoran v")
public class Valoran implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ValoranPK id;

	private String descripcion;

	private int puntuacion;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="email")
	private Usuario usuario;

	//bi-directional many-to-one association to Lugar
	@ManyToOne
	@JoinColumn(name="id_lugar")
	private Lugar lugar;

	public Valoran() {
	}

	public ValoranPK getId() {
		return this.id;
	}

	public void setId(ValoranPK id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPuntuacion() {
		return this.puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Lugar getLugar() {
		return this.lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

}