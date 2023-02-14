package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Consultar;

@Repository

public class ConsultarDaoImpl implements ConsultarDao {
	@Autowired
	ConsultarJpaSpring consultarDao;

	@Override
	public void addConsultar(Consultar consultar) {
		// TODO Auto-generated method stub
		consultarDao.save(consultar);
	}

	@Override
	public void removeConsultar(Consultar consultar) {
		// TODO Auto-generated method stub
		consultarDao.delete(consultar);
	}

	@Override
	public List<Consultar>getConsultar() {
		// TODO Auto-generated method stub
		return consultarDao.findAll();
	}

	@Override
	public void removeConsultar(int id) {
		// TODO Auto-generated method stub
		consultarDao.deleteById(id);
	}

	@Override
	public Consultar retrieveConsultar(int id) {
		// TODO Auto-generated method stub
		return consultarDao.findById(id).orElse(null);
	}

	@Override
	public void updateConsultar(Consultar consultar) {
		// TODO Auto-generated method stub
		consultarDao.save(consultar);
	}
}
