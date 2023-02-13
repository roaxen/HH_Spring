package model;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the consultar database table.
 * 
 */
@Entity
@NamedQuery(name="Consultar.findAll", query="SELECT c FROM Consultar c")
public class Consultar implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConsultarPK id;

	//bi-directional many-to-one association to Ofertaempleo
	@ManyToOne
	@JoinColumn(name="id_oferta")
	private Ofertaempleo ofertaempleo;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="email_usuario")
	private Usuario usuario;

	public Consultar() {
	}

	public ConsultarPK getId() {
		return this.id;
	}

	public void setId(ConsultarPK id) {
		this.id = id;
	}

	public Ofertaempleo getOfertaempleo() {
		return this.ofertaempleo;
	}

	public void setOfertaempleo(Ofertaempleo ofertaempleo) {
		this.ofertaempleo = ofertaempleo;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}