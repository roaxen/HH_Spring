package service;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Favorito;

@Service
public interface FavoritoService {

	List<Favorito> retrieveFavoritos();

	Favorito retrieveFavorito(Favorito favorito);

	Boolean addFavorito(Favorito favorito);

	Boolean deleteFavorito(Favorito favorito);

}