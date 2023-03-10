package model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the ofertaempleo database table.
 * 
 */
@Entity
@NamedQuery(name="Ofertaempleo.findAll", query="SELECT o FROM Ofertaempleo o")
public class Ofertaempleo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_oferta")
	private int idOferta;

	private String lugar;

	private String mensaje;

	private String titulo;

	//bi-directional many-to-one association to Consultar
	@OneToMany(mappedBy="ofertaempleo")
	private List<Consultar> consultars;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="email_creador")
	private Usuario usuario;

	public Ofertaempleo() {
	}

	public int getIdOferta() {
		return this.idOferta;
	}

	public void setIdOferta(int idOferta) {
		this.idOferta = idOferta;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getMensaje() {
		return this.mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Consultar> getConsultars() {
		return this.consultars;
	}

	public void setConsultars(List<Consultar> consultars) {
		this.consultars = consultars;
	}

	public Consultar addConsultar(Consultar consultar) {
		getConsultars().add(consultar);
		consultar.setOfertaempleo(this);

		return consultar;
	}

	public Consultar removeConsultar(Consultar consultar) {
		getConsultars().remove(consultar);
		consultar.setOfertaempleo(null);

		return consultar;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}