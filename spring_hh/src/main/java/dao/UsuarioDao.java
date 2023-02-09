package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Usuario;
@Service
public interface UsuarioDao {
		//Añadir trabajador
		void addUsuario(Usuario usuario);
		
		//Eliminar trabajador (Pasando objeto)
		void removeUsuario(Usuario usuario);
		
		// Devuelve todos los usuarios
		List<Usuario> getUsuario();
		
		//Eliminar trabajador (Pasando clave primaria)
		void removeUsuario(int idUsuario);
		
		// Devuelve un usuario, Busca un usuario por su id 
		Usuario retrieveUsuario(int idUsuario);
		
		// Modifica un usuario 
		void updateUsuario(Usuario usuario);
}
