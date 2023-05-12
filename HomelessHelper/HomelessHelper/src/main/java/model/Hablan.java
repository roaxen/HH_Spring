package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the hablan database table.
 * 
 */
@Entity
@NamedQuery(name="Hablan.findAll", query="SELECT h FROM Hablan h")
public class Hablan implements Serializable {
	@Override
	public String toString() {
		return "Hablan [id=" + id + ", mensaje=" + mensaje + "]";
	}

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private HablanPK id;

	@Lob
	private String mensaje;

	public Hablan() {
	}

	public HablanPK getId() {
		return this.id;
	}

	public void setId(HablanPK id) {
		this.id = id;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}