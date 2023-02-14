package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Ofertaempleo;

@Repository

public class OfertaempleoDaoImpl implements OfertaempleoDao {
	@Autowired
	OfertaempleoJpaSpring ofertaempleoDao;

	@Override
	public void addOfertaempleo(Ofertaempleo ofertaempleo) {
		// TODO Auto-generated method stub
		ofertaempleoDao.save(ofertaempleo);
	}

	@Override
	public void removeOfertaempleo(Ofertaempleo ofertaempleo) {
		// TODO Auto-generated method stub
		ofertaempleoDao.delete(ofertaempleo);
	}

	@Override
	public List<Ofertaempleo>getOfertaempleo() {
		// TODO Auto-generated method stub
		return ofertaempleoDao.findAll();
	}

	@Override
	public void removeOfertaempleo(int id) {
		// TODO Auto-generated method stub
		ofertaempleoDao.deleteById(id);
	}

	@Override
	public Ofertaempleo retrieveOfertaempleo(int id) {
		// TODO Auto-generated method stub
		return ofertaempleoDao.findById(id).orElse(null);
	}

	@Override
	public void updateOfertaempleo(Ofertaempleo ofertaempleo) {
		// TODO Auto-generated method stub
		ofertaempleoDao.save(ofertaempleo);
	}
}
