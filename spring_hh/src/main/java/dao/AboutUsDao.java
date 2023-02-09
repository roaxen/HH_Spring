package dao;

import java.util.List;

import model.Aboutus;

public interface AboutUsDao {

	
	//Añadir trabajador
	void addaboutUs(Aboutus usuario);
	
	//Eliminar trabajador (Pasando objeto)
	void removeaboutUs(Aboutus usuario);
	
	// Devuelve todos los usuarios
	List<Aboutus> getaboutUs();
	
	//Eliminar trabajador (Pasando clave primaria)
	void removeaboutUs(int idUsuario);
	
	// Devuelve un usuario, Busca un usuario por su id 
	Aboutus retrieveaboutUs(int idUsuario);
	
	// Modifica un usuario 
	void updateaboutUs(Aboutus usuario);

}
