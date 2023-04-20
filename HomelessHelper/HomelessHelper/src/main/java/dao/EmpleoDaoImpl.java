package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Empleo;

@Repository
public class EmpleoDaoImpl implements EmpleoDao {
	@Autowired
	EmpleoJpaSpring empleoDao;

	@Override
	public void addEmpleo(Empleo empleo) {
		// TODO Auto-generated method stub
		empleoDao.save(empleo);
	}

	@Override
	public void removeEmpleo(Empleo empleo) {
		// TODO Auto-generated method stub
		empleoDao.delete(empleo);
	}

	@Override
	public List<Empleo> getEmpleo() {
		// TODO Auto-generated method stub
		return empleoDao.findAll();
	}

	@Override
	public void removeEmpleo(int idEmpleo) {
		// TODO Auto-generated method stub
		empleoDao.deleteById(idEmpleo);

	}

	@Override
	public Empleo retrieveEmpleo(int idEmpleo) {
		// TODO Auto-generated method stub
		return empleoDao.findById(idEmpleo).orElse(null);
	}

	@Override
	public void updateEmpleo(Empleo empleo) {
		// TODO Auto-generated method stub
		empleoDao.save(empleo);

	}

	@Override
	public List<Empleo> getEmpleosPorTipo(int idTipoEmpleo) {
		// TODO Auto-generated method stub
		return empleoDao.findEmpleosByTipoEmpleo(idTipoEmpleo);
	}

	@Override
	public List<Empleo> findEmpleosByWord(String valor) {
		// TODO Auto-generated method stub
		return empleoDao.findEmpleosByWord(valor);
	}
}
