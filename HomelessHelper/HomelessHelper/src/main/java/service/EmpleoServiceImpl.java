package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmpleoDao;
import model.Empleo;

@Service
public class EmpleoServiceImpl implements EmpleoService {

	@Autowired
	EmpleoDao empleoDao;

	@Override
	public boolean addEmpleo(Empleo empleo) {

		if (empleoDao.retrieveEmpleo(empleo.getId()) == null) {
			empleoDao.addEmpleo(empleo);
			return true;
		}
		return false;
	}

	@Override
	public List<Empleo> retrieveEmpleo() {

		return empleoDao.getEmpleo();
	}

	@Override
	public boolean updateEmpleo(Empleo empleo) {
		if (empleoDao.retrieveEmpleo(empleo.getId()) != null) {
			empleoDao.addEmpleo(empleo);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmpleo(int idEmpleo) {
		if (empleoDao.retrieveEmpleo(idEmpleo) != null) {
			empleoDao.removeEmpleo(idEmpleo);
			return true;
		}
		return false;
	}

	@Override
	public Empleo retrieveEmpleo(int idEmpleo) {

		return empleoDao.retrieveEmpleo(idEmpleo);
	}

	@Override
	public List<Empleo> getEmpleosPorTipo(int idTipoEmpleo) {
		// TODO Auto-generated method stub
		return empleoDao.getEmpleosPorTipo(idTipoEmpleo);
	}

	@Override
	public List<Empleo> findEmpleosByWord(String valor) {
		// TODO Auto-generated method stub
		return empleoDao.findEmpleosByWord(valor);
	}

	@Override
	public List<Empleo> findEmpleosByEmail(String email) {
		// TODO Auto-generated method stub
		return empleoDao.findEmpleosByEmail(email);
	}

	@Override
	public List<Empleo> retrieveEmpleos(String email) {
		// TODO Auto-generated method stub
		return empleoDao.getEmpleos(email);
	}
}
