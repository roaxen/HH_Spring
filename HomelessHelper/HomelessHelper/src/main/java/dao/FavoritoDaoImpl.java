package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Favorito;

@Repository
public class FavoritoDaoImpl implements FavoritoDao {
	@Autowired
	FavoritoJpaSpring favoritoDao;

	@Override
	public List<Favorito> getFavoritos() {
		// TODO Auto-generated method stub
		return favoritoDao.findAll();
	}

	@Override
	public Favorito getFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		return favoritoDao.findByEmail(favorito.getId().getEmail());
	}

	@Override
	public Favorito addFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		return favoritoDao.save(favorito);
	}

	@Override
	public Boolean deleteFavorito(Favorito favorito) {
		// TODO Auto-generated method stub
		if (favoritoDao.findByEmail(favorito.getId().getEmail()) != null) {
			favoritoDao.delete(favorito);
			return true;
		} else {
			return false;
		}
	}

}
