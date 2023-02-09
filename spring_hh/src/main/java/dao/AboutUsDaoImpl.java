package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Aboutus;
import model.Usuario;
@Repository   // porque esto tiene este tag 
public class AboutUsDaoImpl implements AboutUsDao {
	@Autowired  // porque esto tiene este tag 
	AboutJpaSpring aboutUsDao;

	@Override
	public void addaboutUs(Aboutus aboutus) {
		// TODO Auto-generated method stub
		//usuarioDao.save(usuario);
		System.out.print("add user no va");

	}

	@Override
	public void removeaboutUs(Aboutus aboutus) {
		// TODO Auto-generated method stub
		aboutUsDao.delete(aboutus);
		
	}

	@Override
	public List<Aboutus> getaboutUs() {
		// TODO Auto-generated method stub
		return aboutUsDao.findAll();
	}

	@Override
	public void removeaboutUs(int aboutus) {
		// TODO Auto-generated method stub
		aboutUsDao.deleteById(aboutus);

	}

	@Override
	public Aboutus retrieveaboutUs(int aboutus) {
		// TODO Auto-generated method stub
		return aboutUsDao.findById(aboutus).orElse(null);
	}

	@Override
	public void updateaboutUs(Aboutus aboutus) {
		// TODO Auto-generated method stub
		aboutUsDao.save(aboutus);

	}
	
}
