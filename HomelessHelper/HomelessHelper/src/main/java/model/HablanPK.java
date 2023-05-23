package model;

import java.io.Serializable;
import jakarta.persistence.*;

/**
 * The primary key class for the hablan database table.
 * 
 */
@Embeddable
public class HablanPK implements Serializable {

	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="email_user1", insertable=false, updatable=false)
	private String emailUser1;

	@Column(name="email_user2", insertable=false, updatable=false)
	private String emailUser2;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_mensaje")
	private java.util.Date fechaMensaje;

	public HablanPK() {
	}
	public String getEmailUser1() {
		return this.emailUser1;
	}
	public void setEmailUser1(String emailUser1) {
		this.emailUser1 = emailUser1;
	}
	public String getEmailUser2() {
		return this.emailUser2;
	}
	public void setEmailUser2(String emailUser2) {
		this.emailUser2 = emailUser2;
	}
	public java.util.Date getFechaMensaje() {
		return this.fechaMensaje;
	}
	public void setFechaMensaje(java.util.Date fechaMensaje) {
		this.fechaMensaje = fechaMensaje;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof HablanPK)) {
			return false;
		}
		HablanPK castOther = (HablanPK)other;
		return 
			this.emailUser1.equals(castOther.emailUser1)
			&& this.emailUser2.equals(castOther.emailUser2)
			&& this.fechaMensaje.equals(castOther.fechaMensaje);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.emailUser1.hashCode();
		hash = hash * prime + this.emailUser2.hashCode();
		hash = hash * prime + this.fechaMensaje.hashCode();
		
		return hash;
	}
	
	@Override
	public String toString() {
		return "HablanPK [emailUser1=" + emailUser1 + ", emailUser2=" + emailUser2 + ", fechaMensaje=" + fechaMensaje
				+ "]";
	}
}