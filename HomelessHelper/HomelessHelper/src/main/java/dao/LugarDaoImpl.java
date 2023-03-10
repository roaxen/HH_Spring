package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Lugar;

@Repository
public class LugarDaoImpl implements LugarDao {
	@Autowired
	LugarJpaSpring lugarDao;

	@Override
	public void addLugar(Lugar lugar) {
		// TODO Auto-generated method stub
		lugarDao.save(lugar);
	}

	@Override
	public void removeLugar(Lugar lugar) {
		// TODO Auto-generated method stub
		lugarDao.delete(lugar);

	}

	@Override
	public List<Lugar> getLugar() {
		// TODO Auto-generated method stub
		return lugarDao.findAll();
	}

	@Override
	public void removeLugar(int idLugar) {
		// TODO Auto-generated method stub
		lugarDao.deleteById(idLugar);

	}

	@Override
	public Lugar retrieveLugar(int idLugar) {
		// TODO Auto-generated method stub
		return lugarDao.findById(idLugar).orElse(null);
	}

	@Override
	public void updateLugar(Lugar lugar) {
		// TODO Auto-generated method stub
		lugarDao.save(lugar);

	}
}
