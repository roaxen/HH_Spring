package model;

public class Credenciales {
	
	String clave;
	String email;
	String new_clave;
	
	public Credenciales(String clave, String email) {
		super();
		this.clave = clave;
		this.email = email;
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
