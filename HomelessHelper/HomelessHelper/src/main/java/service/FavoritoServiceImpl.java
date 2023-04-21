package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.FavoritoDao;
import model.Favorito;

@Service
public class FavoritoServiceImpl implements FavoritoService {

	@Autowired
	FavoritoDao favoritoDao;

	@Override
	public List<Favorito> retrieveFavoritos() {
		// TODO Auto-generated method stub
		return favoritoDao.getFavoritos();
	}

	@Override
	public List<Favorito> retrieveFavorito(String email) {
		// TODO Auto-generated method stub
		return favoritoDao.getFavorito(email);
	}

	@Override
	public Boolean addFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		if (favoritoDao.addFavorito(favorito)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Boolean deleteFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		return favoritoDao.deleteFavorito(favorito);
	}

	@Override
	public boolean checkFavExists(Favorito fav) {
		// TODO Auto-generated method stub
		return favoritoDao.checkFavExists(fav);
	}

}
