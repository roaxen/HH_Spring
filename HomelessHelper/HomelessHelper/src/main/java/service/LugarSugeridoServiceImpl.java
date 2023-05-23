package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LugarSugeridoDao;
import model.Lugarsugerido;

@Service
public class LugarSugeridoServiceImpl implements LugarSugeridoService {

	@Autowired
	LugarSugeridoDao lugarDao;

	@Override
	public boolean addLugarsugerido(Lugarsugerido lugar) {

		if (lugarDao.retrieveLugarsugerido(lugar.getIdLugarsugerido()) == null) {
			lugarDao.addLugarsugerido(lugar);
			return true;
		}
		return false;
	}

	@Override
	public List<Lugarsugerido> retrieveLugarsugerido() {

		return lugarDao.getLugarsugerido();
	}

	@Override
	public boolean updateLugarsugerido(Lugarsugerido lugar) {
		if (lugarDao.retrieveLugarsugerido(lugar.getIdLugarsugerido()) != null) {
			lugarDao.addLugarsugerido(lugar);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteLugarsugerido(int idLugarsugerido) {
		if (lugarDao.retrieveLugarsugerido(idLugarsugerido) != null) {
			lugarDao.removeLugarsugerido(idLugarsugerido);
			return true;
		}
		return false;
	}

	@Override
	public Lugarsugerido retrieveLugarsugerido(int idLugarsugerido) {

		return lugarDao.retrieveLugarsugerido(idLugarsugerido);
	}

	@Override
	public List<Lugarsugerido> getLugaresPorTipo(int idTipoLugarsugerido) {
		// TODO Auto-generated method stub
		return lugarDao.getLugaresPorTipo(idTipoLugarsugerido);
	}

	@Override
	public List<Lugarsugerido> findLugaresByWord(String valor) {
		// TODO Auto-generated method stub
		return lugarDao.findLugaresByWord(valor);
	}
}