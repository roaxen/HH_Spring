package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.AboutUsDao;
import model.Aboutus;

@Service
public class AboutUsServiceImpl implements AboutUsService{
	@Autowired
	AboutUsDao aboutUsDao;
	@Override
	public boolean addAboutus(Aboutus usuario) { // porque devuelven true o false ? en  donde uso estos boleans 

		if(aboutUsDao.retrieveaboutUs(usuario.getId()) == null) {
			aboutUsDao.addaboutUs(usuario);
			return true;
		}
		return false;
	}

	@Override
	public List<Aboutus> retrieveAboutus() {

		return aboutUsDao.getaboutUs();
	}

	@Override
	public boolean updateAboutus(Aboutus usuario) {
		if(aboutUsDao.retrieveaboutUs(usuario.getId())!= null)
		{
			aboutUsDao.removeaboutUs(usuario);
			return true;
		}
		return false;	
	}

	@Override
	public boolean deleteAboutus(int idUsuario) {
		if(aboutUsDao.retrieveaboutUs(idUsuario)!= null) {
			aboutUsDao.removeaboutUs(idUsuario);
			return true;
		}
		return false;
	}


	@Override
	public Aboutus retrieveAboutus(int aa) {
		// TODO Auto-generated method stub
		return aboutUsDao.retrieveaboutUs(aa);
	}
}
