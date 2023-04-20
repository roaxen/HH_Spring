package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TipoempleoDao;
import model.Tipoempleo;

@Service
public class TipoempleoServiceImpl implements TipoempleoService{
	
	@Autowired
	TipoempleoDao tipoempleoDao;

	@Override
	public List<Tipoempleo> retrieveTipoempleo() {
		// TODO Auto-generated method stub
		return tipoempleoDao.retrieveTipoempleo();
	}

	@Override
	public Tipoempleo getTipoEmpleo(int idTipoempleo) {
		// TODO Auto-generated method stub
		return tipoempleoDao.getTipoempleo(idTipoempleo);
	}

}
