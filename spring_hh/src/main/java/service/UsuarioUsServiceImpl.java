package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UsuarioDao;
import model.Usuario;

@Service
public class UsuarioUsServiceImpl implements UsuarioService{
	@Autowired
	UsuarioDao usuarioDao;
	@Override
	public boolean addUsuario(Usuario usuario) { // porque devuelven true o false ? en  donde uso estos boleans 

		if(usuarioDao.retrieveUsuario(usuario.getId()) == null) {
			usuarioDao.addUsuario(usuario);
			return true;
		}
		return false;
	}

	@Override
	public List<Usuario> retrieveUsuario() {

		return usuarioDao.getUsuario();
	}

	@Override
	public boolean updateUsuario(Usuario usuario) {
		if(usuarioDao.retrieveUsuario(usuario.getId())!= null)
		{
			usuarioDao.removeUsuario(usuario);
			return true;
		}
		return false;	
	}

	@Override
	public boolean deleteUsuario(int idUsuario) {
		if(usuarioDao.retrieveUsuario(idUsuario)!= null) {
			usuarioDao.removeUsuario(idUsuario);
			return true;
		}
		return false;
	}

	@Override
	public Usuario retrieveUsuario(int idUsuario) {
		
		return usuarioDao.retrieveUsuario(idUsuario);
	}
	

}
