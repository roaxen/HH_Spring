package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Usuario;

@Repository

public class UsuarioDaoImpl implements UsuarioDao {
	@Autowired
	UsuarioJpaSpring usuarioDao;

	@Override
	public void addUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDao.save(usuario);
	}

	@Override
	public void removeUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDao.delete(usuario);
	}

	@Override
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		return usuarioDao.findAll();
	}

	@Override
	public void removeUsuario(String email) {
		// TODO Auto-generated method stub
		usuarioDao.deleteById(email);
	}

	@Override
	public Usuario retrieveUsuario(String email) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(email).orElse(null);
	}

	@Override
	public void updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDao.save(usuario);
	}
	
	@Override
	public void checkameUsuario(String email, String clave) {
		// TODO Auto-generated method stub
		usuarioDao.checkUserExists(email, clave);
	}
	
}
