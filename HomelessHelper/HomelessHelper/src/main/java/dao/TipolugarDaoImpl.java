package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Tipolugar;

@Repository
public class TipolugarDaoImpl implements TipolugarDao{

	@Autowired
	TipolugarJpaSpring tipolugarJpaSpring;
	
	@Override
	public Tipolugar getTipoLugar(String descripcion) {
		// TODO Auto-generated method stub
		return tipolugarJpaSpring.selectTipoLugar(descripcion);
	}

}
