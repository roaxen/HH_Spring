package service;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UsuarioDao;
import model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioDao usuarioDao;

	@Override
	public boolean addUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		if (usuarioDao.retrieveUsuario(usuario.getEmail()) == null) {
			usuario.setClave(encrypt(usuario.getClave()));
			usuarioDao.addUsuario(usuario);
			return true;
		}
		return false;
	}

	@Override
	public List<Usuario> retrieveUsuarios() {
		// TODO Auto-generated method stub
		return usuarioDao.getUsuarios();
	}

	@Override
	public boolean updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		if (usuarioDao.retrieveUsuario(usuario.getEmail()) != null) {
			usuario.setClave(encrypt(usuario.getClave()));
			usuarioDao.updateUsuario(usuario);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUsuario(String email) {
		// TODO Auto-generated method stub
		if (usuarioDao.retrieveUsuario(email) != null) {
			usuarioDao.removeUsuario(email);
			return true;
		}
		return false;
	}

	@Override
	public Usuario retrieveUsuario(String email) {
		// TODO Auto-generated method stub
		return usuarioDao.retrieveUsuario(email);
	}

	@Override
	public Usuario checkUserExists(String email, String clave) {
		// TODO Auto-generated method stub
		return usuarioDao.checkameUsuario(email, encrypt(clave));
	}

	@Override
	public boolean updatePassword(String email, String clave, String new_clave) {
		// TODO Auto-generated method stub
		if (usuarioDao.checkameUsuario(email, encrypt(clave)).getEmail() != null) {
			Usuario user = checkUserExists(email, clave);
			user.setClave(encrypt(new_clave));
			usuarioDao.updateUsuario(user);
			return true;
		}
		return false;
	}

	public String encrypt(String clave) {

		String claveCriptica = DigestUtils.md5Hex(clave);

		return claveCriptica;
	}
}