package model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the valoran database table.
 * 
 */
@Embeddable
public class ValoranPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String email;

	@Column(name="id_lugar", insertable=false, updatable=false)
	private int idLugar;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_valoracion")
	private java.util.Date fechaValoracion;

	public ValoranPK() {
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdLugar() {
		return this.idLugar;
	}
	public void setIdLugar(int idLugar) {
		this.idLugar = idLugar;
	}
	public java.util.Date getFechaValoracion() {
		return this.fechaValoracion;
	}
	public void setFechaValoracion(java.util.Date fechaValoracion) {
		this.fechaValoracion = fechaValoracion;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ValoranPK)) {
			return false;
		}
		ValoranPK castOther = (ValoranPK)other;
		return 
			this.email.equals(castOther.email)
			&& (this.idLugar == castOther.idLugar)
			&& this.fechaValoracion.equals(castOther.fechaValoracion);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.email.hashCode();
		hash = hash * prime + this.idLugar;
		hash = hash * prime + this.fechaValoracion.hashCode();
		
		return hash;
	}
}