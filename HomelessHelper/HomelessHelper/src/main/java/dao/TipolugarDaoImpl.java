package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Tipolugar;

@Repository
public class TipolugarDaoImpl implements TipolugarDao {

	@Autowired
	TipolugarJpaSpring tipolugarJpaSpring;

	@Override
	public Tipolugar getTipoLugar(int idTipoLugar) {
		// TODO Auto-generated method stub
		return tipolugarJpaSpring.findById(idTipoLugar).orElse(null);
	}

	@Override
	public List<Tipolugar> retrieveTipolugar() {
		// TODO Auto-generated method stub
		return tipolugarJpaSpring.findAll();
	}
}
