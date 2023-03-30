package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TipolugarDao;
import model.Tipolugar;

@Service
public class TipolugarServiceImpl implements TipolugarService{

	@Autowired
	TipolugarDao tipolugardao;
	
	@Override
	public Tipolugar getTipoLugar(String descripcion) {
		// TODO Auto-generated method stub
		return tipolugardao.getTipoLugar(descripcion);
	}

}
