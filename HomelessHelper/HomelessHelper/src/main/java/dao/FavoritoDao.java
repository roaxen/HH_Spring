package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Favorito;

@Service
public interface FavoritoDao {

	List<Favorito> getFavoritos();

	Favorito getFavorito(Favorito favorito);

	Boolean addFavorito(Favorito favorito);

	Boolean deleteFavorito(Favorito favorito);
	
}