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
import model.Favorito;

@RestController
public class FavoritoController {
	@Autowired
	FavoritoService favoritoservice;

	@GetMapping(value = "favoritos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Favorito> retrieveFavoritos() {
		return favoritoservice.retrieveFavoritos();
	}

	@GetMapping(value = "favorito", produces = MediaType.APPLICATION_JSON_VALUE)
	public Favorito retrieveFavorito(@RequestBody Favorito favorito) {
		return favoritoservice.retrieveFavorito(favorito);
	}

	@PostMapping(value = "newFavorito", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveFavorito(@RequestBody Favorito favorito) {
		return String.valueOf(favoritoservice.addFavorito(favorito));
	}

	@DeleteMapping(value = "deleteFavorito", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteFavorito(@RequestBody Favorito favorito) {
		return String.valueOf(favoritoservice.deleteFavorito(favorito));
	}
}
