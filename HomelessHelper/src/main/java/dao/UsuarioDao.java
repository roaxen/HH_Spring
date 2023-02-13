package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Usuario;

@Service
public interface UsuarioDao {
	void addUsuario(Usuario Usuario);

	void removeUsuario(String email);

	List<Usuario> getUsuarios();

	Usuario retrieveUsuario(String string);

	void updateUsuario(Usuario Usuario);

	void removeUsuario(Usuario usuario);

	void checkameUsuario(String email, String clave);

}