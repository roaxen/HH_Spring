package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Tipoempleo;

@Repository
public class TipoempleoDaoImpl implements TipoempleoDao{

	@Autowired
	TipoempleoJpaSpring tipoempleoDao;

	@Override
	public List<Tipoempleo> retrieveTipoempleo() {
		// TODO Auto-generated method stub
		return tipoempleoDao.findAll();
	}

	@Override
	public Tipoempleo getTipoempleo(int idTipoempleo) {
		// TODO Auto-generated method stub
		return tipoempleoDao.findById(idTipoempleo).orElse(null);
	}
}
