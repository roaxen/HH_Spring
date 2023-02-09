package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Usuario;
@Repository   // porque esto tiene este tag 
public class usuarioDaoImpl implements UsuarioDao {
	@Autowired  // porque esto tiene este tag 
	UsuarioJpaSpring usuarioDao;

	@Override
	public void addUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		//usuarioDao.save(usuario);
		System.out.print("add user no va");

	}

	@Override
	public void removeUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDao.delete(usuario);
		
	}

	@Override
	public List<Usuario> getUsuario() {
		// TODO Auto-generated method stub
		return usuarioDao.findAll();
	}

	@Override
	public void removeUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		usuarioDao.deleteById(idUsuario);

	}

	@Override
	public Usuario retrieveUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(idUsuario).orElse(null);
	}

	@Override
	public void updateUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioDao.save(usuario);

	}
	
}
