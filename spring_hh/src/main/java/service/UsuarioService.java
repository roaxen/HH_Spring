package service;

import java.util.List;
import model.Usuario;
import org.springframework.stereotype.Service;

  @Service
public interface UsuarioService {
	

		boolean addUsuario(Usuario usuario);
		List<Usuario> retrieveUsuario();
		boolean updateUsuario(Usuario usuario);
		boolean deleteUsuario(int idUsuario);
		Usuario retrieveUsuario(int idUsuario);
	
}
