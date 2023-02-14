package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ConsultarDao;
import model.Consultar;

@Service
public class ConsultarServiceImpl implements ConsultarService {

	@Autowired
	ConsultarDao consultarDao;

	@Override
	public boolean addConsultar(Consultar consultar) {
		// TODO Auto-generated method stub
		if (consultarDao.retrieveConsultar(consultar.getId()) == null) {
			consultarDao.addConsultar(consultar);
			return true;
		}
		return false;
	}

	@Override
	public List<Consultar> retrieveConsultar() {
		// TODO Auto-generated method stub
		return consultarDao.getConsultar();
	}

	@Override
	public boolean updateConsultar(Consultar consultar) {
		// TODO Auto-generated method stub
		if (consultarDao.retrieveConsultar(consultar.getId()) != null) {
			consultarDao.updateConsultar(consultar);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteConsultar(int id) {
		// TODO Auto-generated method stub
		if (consultarDao.retrieveConsultar(id) != null) {
			consultarDao.removeConsultar(id);
			return true;
		}
		return false;
	}

	@Override
	public Consultar retrieveConsultar(int id) {
		// TODO Auto-generated method stub
		return consultarDao.retrieveConsultar(id);
	}

}
