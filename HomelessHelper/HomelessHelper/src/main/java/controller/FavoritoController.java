package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import service.FavoritoService;
import service.LugarService;
import model.Favorito;
import model.FavoritoPK;
import model.Lugar;

@RestController
public class FavoritoController {

	@Autowired
	FavoritoService favoritoservice;

	@Autowired
	LugarService lugarservice;

	@GetMapping(value = "favoritos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Favorito> retrieveFavoritos() {
		return favoritoservice.retrieveFavoritos();
	}

	@PostMapping(value = "favorito", produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean getFavorito(@RequestBody Favorito fav) {

		if (favoritoservice.checkFavExists(fav)) {
			return true;
		} else {
			return false;
		}
	}

	@PostMapping(value = "lugaresFavoritos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lugar> getLugaresFavoritos(@RequestBody FavoritoPK email) {

		List<Lugar> lugaresFavoritos = new ArrayList<Lugar>();

		email.setIdLugar(0);

		List<Favorito> favoritosEmail = favoritoservice.retrieveFavorito(email.getEmail());

		for (Favorito f : favoritosEmail) {

			Lugar lugarActual = lugarservice.retrieveLugar(f.getId().getIdLugar());

			lugaresFavoritos.add(lugarActual);
		}
		return lugaresFavoritos;
	}

	@PostMapping(value = "newFavorito", produces = MediaType.APPLICATION_JSON_VALUE)
	public Favorito saveFavorito(@RequestBody Favorito favorito) {

		if (favoritoservice.addFavorito(favorito)) {
			return favorito;
		} else {
			Favorito favNull = new Favorito();
			return favNull;
		}
	}

	@DeleteMapping(value = "deleteFavorito/{id}/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteFavorito(@PathVariable int id, @PathVariable String email) {

		FavoritoPK fav = new FavoritoPK();
		fav.setIdLugar(id);
		fav.setEmail(email);

		Favorito favorito = new Favorito();
		favorito.setId(fav);

		return String.valueOf(favoritoservice.deleteFavorito(favorito));
	}
}
