package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TipolugarDao;
import model.Tipolugar;

@Service
public class TipolugarServiceImpl implements TipolugarService{

	@Autowired
	TipolugarDao tipolugardao;
	
	@Override
	public Tipolugar getTipoLugar(int idTipoLugar) {
		// TODO Auto-generated method stub
		return tipolugardao.getTipoLugar(idTipoLugar);
	}

	@Override
	public List<Tipolugar> retrieveTipolugar() {
		// TODO Auto-generated method stub
		return tipolugardao.retrieveTipolugar();
	}

}
