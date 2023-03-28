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
	public Favorito retrieveFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		return favoritoDao.getFavorito(favorito);
	}

	@Override
	public Favorito addFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		return favoritoDao.addFavorito(favorito);
	}

	@Override
	public Boolean deleteFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		return favoritoDao.deleteFavorito(favorito);
	}

}
