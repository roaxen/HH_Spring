package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Favorito;
import model.FavoritoPK;

@Repository

public class FavoritoDaoImpl implements FavoritoDao {
	@Autowired
	FavoritoJpaSpring favoritoDao;

	@Override
	public void addFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		favoritoDao.save(favorito);		
	}

	@Override
	public void removeFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		favoritoDao.delete(favorito);
	}

	@Override
	public List<Favorito> getFavoritos() {
		// TODO Auto-generated method stub
		return favoritoDao.findAll();
	}

	@Override
	public void removeFavorito(FavoritoPK favoritoPK) {
		// TODO Auto-generated method stub
		favoritoDao.deleteById(favoritoPK.getEmail());
	}

	@Override
	public Favorito retrieveFavorito(FavoritoPK favoritoPK) {
		// TODO Auto-generated method stub
		return favoritoDao.findById(favoritoPK.getEmail()).orElse(null);
	}

	@Override
	public void updateFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		favoritoDao.save(favorito);
	}

	
}
