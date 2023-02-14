package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TipolugarDao;
import model.Tipolugar;

@Service
public class TipolugarServiceImpl implements TipolugarService {

	@Autowired
	TipolugarDao tipolugarDao;

	@Override
	public boolean addTipolugar(Tipolugar tipolugar) {
		// TODO Auto-generated method stub
		if (tipolugarDao.retrieveTipolugar(tipolugar.getIdTipolugar()) == null) {
			tipolugarDao.addTipolugar(tipolugar);
			return true;
		}
		return false;
	}

	@Override
	public List<Tipolugar> retrieveTipolugar() {
		// TODO Auto-generated method stub
		return tipolugarDao.getTipolugar();
	}

	@Override
	public boolean updateTipolugar(Tipolugar tipolugar) {
		// TODO Auto-generated method stub
		if (tipolugarDao.retrieveTipolugar(tipolugar.getIdTipolugar()) != null) {
			tipolugarDao.updateTipolugar(tipolugar);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteTipolugar(int id) {
		// TODO Auto-generated method stub
		if (tipolugarDao.retrieveTipolugar(id) != null) {
			tipolugarDao.removeTipolugar(id);
			return true;
		}
		return false;
	}

	@Override
	public Tipolugar retrieveTipolugar(int id) {
		// TODO Auto-generated method stub
		return tipolugarDao.retrieveTipolugar(id);
	}

}
