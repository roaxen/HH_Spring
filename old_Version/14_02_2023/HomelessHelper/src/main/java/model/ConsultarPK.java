package model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the consultar database table.
 * 
 */
@Embeddable
public class ConsultarPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="email_usuario", insertable=false, updatable=false)
	private String emailUsuario;

	@Column(name="id_oferta", insertable=false, updatable=false)
	private int idOferta;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_consulta")
	private java.util.Date fechaConsulta;

	public ConsultarPK() {
	}
	public String getEmailUsuario() {
		return this.emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public int getIdOferta() {
		return this.idOferta;
	}
	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}
	public java.util.Date getFechaConsulta() {
		return this.fechaConsulta;
	}
	public void setFechaConsulta(java.util.Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConsultarPK)) {
			return false;
		}
		ConsultarPK castOther = (ConsultarPK)other;
		return 
			this.emailUsuario.equals(castOther.emailUsuario)
			&& (this.idOferta == castOther.idOferta)
			&& this.fechaConsulta.equals(castOther.fechaConsulta);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.emailUsuario.hashCode();
		hash = hash * prime + this.idOferta;
		hash = hash * prime + this.fechaConsulta.hashCode();
		
		return hash;
	}
}