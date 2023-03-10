package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Tipolugar;

@Repository

public class TipolugarDaoImpl implements TipolugarDao {
	@Autowired
	TipolugarJpaSpring tipolugarDao;

	@Override
	public void addTipolugar(Tipolugar tipolugar) {
		// TODO Auto-generated method stub
		tipolugarDao.save(tipolugar);
	}

	@Override
	public void removeTipolugar(Tipolugar tipolugar) {
		// TODO Auto-generated method stub
		tipolugarDao.delete(tipolugar);
	}

	@Override
	public List<Tipolugar>getTipolugar() {
		// TODO Auto-generated method stub
		return tipolugarDao.findAll();
	}

	@Override
	public void removeTipolugar(int id) {
		// TODO Auto-generated method stub
		tipolugarDao.deleteById(id);
	}

	@Override
	public Tipolugar retrieveTipolugar(int id) {
		// TODO Auto-generated method stub
		return tipolugarDao.findById(id).orElse(null);
	}

	@Override
	public void updateTipolugar(Tipolugar tipolugar) {
		// TODO Auto-generated method stub
		tipolugarDao.save(tipolugar);
	}
}
