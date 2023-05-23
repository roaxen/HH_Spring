package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Lugarsugerido;

@Repository
public class LugarSugeridoDaoImpl implements LugarSugeridoDao {
	@Autowired
	LugarSugeridoJpaSpring lugarDao;

	@Override
	public void addLugarsugerido(Lugarsugerido lugar) {
		// TODO Auto-generated method stub
		lugarDao.save(lugar);
	}

	@Override
	public void removeLugarsugerido(Lugarsugerido lugar) {
		// TODO Auto-generated method stub
		lugarDao.delete(lugar);
	}

	@Override
	public List<Lugarsugerido> getLugarsugerido() {
		// TODO Auto-generated method stub
		return lugarDao.findAll();
	}

	@Override
	public void removeLugarsugerido(int idLugar) {
		// TODO Auto-generated method stub
		lugarDao.deleteById(idLugar);

	}

	@Override
	public Lugarsugerido retrieveLugarsugerido(int idLugar) {
		// TODO Auto-generated method stub
		return lugarDao.findById(idLugar).orElse(null);
	}

	@Override
	public void updateLugarsugerido(Lugarsugerido lugar) {
		// TODO Auto-generated method stub
		lugarDao.save(lugar);

	}

	@Override
	public List<Lugarsugerido> getLugaresPorTipo(int idTipoLugar) {
		// TODO Auto-generated method stub
		return lugarDao.findLugaresByTipoLugar(idTipoLugar);
	}

	@Override
	public List<Lugarsugerido> findLugaresByWord(String valor) {
		// TODO Auto-generated method stub
		return lugarDao.findLugaresByWord(valor);
	}
}
