package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Favorito;
import model.FavoritoPK;

@Service
public interface FavoritoService {
	boolean addFavorito(Favorito favorito);

	List<Favorito> retrieveFavorito();

	boolean updateFavorito(Favorito favorito);

	boolean deleteFavorito(FavoritoPK favoritoPK);

	Favorito retrieveFavorito(FavoritoPK favoritoPK);
	
}