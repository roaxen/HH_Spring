package model;

public class Credenciales {

	String clave;
	String email;
	String new_clave;

	public Credenciales(String clave, String email, String new_clave) {
		super();
		this.clave = clave;
		this.email = email;
		this.new_clave = new_clave;
	}

	public Credenciales() {
		super();
	}

	public String getNew_clave() {
		return new_clave;
	}

	public void setNew_clave(String new_clave) {
		this.new_clave = new_clave;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
