package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import service.FavoritoService;
import service.LugarService;
import model.Favorito;

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

	@PostMapping(value = "newFavorito", produces = MediaType.APPLICATION_JSON_VALUE)
	public Favorito saveFavorito(@RequestBody Favorito favorito) {

		if (favoritoservice.addFavorito(favorito)) {
			return favorito;
		} else {
			Favorito favNull = new Favorito();
			return favNull;
		}
	}

	@DeleteMapping(value = "deleteFavorito", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteFavorito(@RequestBody Favorito favorito) {
		return String.valueOf(favoritoservice.deleteFavorito(favorito));
	}
}
