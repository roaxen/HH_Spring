package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Favorito;
import model.FavoritoPK;

@Service
public interface FavoritoDao {
	
	void addFavorito(Favorito favorito);

	void removeFavorito(Favorito favorito);

	List<Favorito> getFavoritos();

	void removeFavorito(FavoritoPK favoritoPK);

	Favorito retrieveFavorito(FavoritoPK favoritoPK);

	void updateFavorito(Favorito favorito);
}