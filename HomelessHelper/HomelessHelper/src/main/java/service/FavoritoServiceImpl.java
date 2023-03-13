package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.FavoritoDao;
import model.Favorito;
import model.FavoritoPK;

@Service
public class FavoritoServiceImpl implements FavoritoService {

	@Autowired
	FavoritoDao favoritoDao;

	@Override
	public boolean addFavorito(Favorito favoritoPK) {
		// TODO Auto-generated method stub
		if (favoritoDao.retrieveFavorito(favoritoPK.getId()) == null) {
			favoritoDao.addFavorito(favoritoPK);
			return true;
		}
		return false;
	}

	@Override
	public List<Favorito> retrieveFavorito() {
		// TODO Auto-generated method stub
		return favoritoDao.getFavoritos();
	}

	@Override
	public boolean updateFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		if (favoritoDao.retrieveFavorito(favorito.getId()) != null) {
			favoritoDao.updateFavorito(favorito);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteFavorito(FavoritoPK favoritoPK) {
		// TODO Auto-generated method stub
		if (favoritoDao.retrieveFavorito(favoritoPK) != null) {
			favoritoDao.removeFavorito(favoritoPK);
			return true;
		}
		return false;
	}

	@Override
	public Favorito retrieveFavorito(FavoritoPK favoritoPK) {
		// TODO Auto-generated method stub
		return favoritoDao.retrieveFavorito(favoritoPK);
	}

}
