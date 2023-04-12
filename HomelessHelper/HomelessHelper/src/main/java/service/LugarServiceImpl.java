package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.LugarDao;
import model.Favorito;
import model.Lugar;

@Service
public class LugarServiceImpl implements LugarService{
	
	@Autowired
	LugarDao lugarDao;
	
	@Override
	public boolean addLugar(Lugar lugar) {

		if(lugarDao.retrieveLugar(lugar.getIdLugar()) == null) {
			lugarDao.addLugar(lugar);
			return true;
		}
		return false;
	}

	@Override
	public List<Lugar> retrieveLugar() {

		return lugarDao.getLugar();
	}

	@Override
	public boolean updateLugar(Lugar lugar) {
		if(lugarDao.retrieveLugar(lugar.getIdLugar())!= null)
		{
			lugarDao.addLugar(lugar);
			return true;
		}
		return false;	
	}

	@Override
	public boolean deleteLugar(int idLugar) {
		if(lugarDao.retrieveLugar(idLugar)!= null) {
			lugarDao.removeLugar(idLugar);
			return true;
		}
		return false;
	}

	@Override
	public Lugar retrieveLugar(int idLugar) {
		
		return lugarDao.retrieveLugar(idLugar);
	}

//	@Override
//	public List<Lugar> retrieveLugarFav(Favorito favorito) {
//		// TODO Auto-generated method stub
//		return lugarDao.getLugaresFav(favorito);
//	}
	

}
