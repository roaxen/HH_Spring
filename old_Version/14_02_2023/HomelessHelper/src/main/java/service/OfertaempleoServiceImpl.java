package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OfertaempleoDao;
import model.Ofertaempleo;

@Service
public class OfertaempleoServiceImpl implements OfertaempleoService {

	@Autowired
	OfertaempleoDao ofertaempleoDao;

	@Override
	public boolean addOfertaempleo(Ofertaempleo ofertaempleo) {
		// TODO Auto-generated method stub
		if (ofertaempleoDao.retrieveOfertaempleo(ofertaempleo.getIdOferta()) == null) {
			ofertaempleoDao.addOfertaempleo(ofertaempleo);
			return true;
		}
		return false;
	}

	@Override
	public List<Ofertaempleo> retrieveOfertaempleo() {
		// TODO Auto-generated method stub
		return ofertaempleoDao.getOfertaempleo();
	}

	@Override
	public boolean updateOfertaempleo(Ofertaempleo ofertaempleo) {
		// TODO Auto-generated method stub
		if (ofertaempleoDao.retrieveOfertaempleo(ofertaempleo.getIdOferta()) != null) {
			ofertaempleoDao.updateOfertaempleo(ofertaempleo);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteOfertaempleo(int id) {
		// TODO Auto-generated method stub
		if (ofertaempleoDao.retrieveOfertaempleo(id) != null) {
			ofertaempleoDao.removeOfertaempleo(id);
			return true;
		}
		return false;
	}

	@Override
	public Ofertaempleo retrieveOfertaempleo(int id) {
		// TODO Auto-generated method stub
		return ofertaempleoDao.retrieveOfertaempleo(id);
	}

}
