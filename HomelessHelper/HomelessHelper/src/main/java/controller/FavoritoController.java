package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import service.FavoritoService;
import model.Favorito;
import model.FavoritoPK;

@RestController
public class FavoritoController {
	@Autowired
	FavoritoService favoritoservice;

	@GetMapping(value = "chats", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Favorito> retrieveFavoritos() {
		return favoritoservice.retrieveFavorito();
	}

	@GetMapping(value = "chat/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Favorito retrieveFavorito(@PathVariable("email") FavoritoPK favoritopk) {
		return favoritoservice.retrieveFavorito(favoritopk);
	}

	@PostMapping(value = "newChat", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveFavorito(@RequestBody Favorito favorito) {
		return String.valueOf(favoritoservice.addFavorito(favorito));
	}

	@PutMapping(value = "actualizarChat", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateFavorito(@RequestBody Favorito favorito) {
		return String.valueOf(favoritoservice.updateFavorito(favorito));
	}

	@DeleteMapping(value = "chat/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteFavorito(@PathVariable("email") FavoritoPK favoritopk) {
		return String.valueOf(favoritoservice.deleteFavorito(favoritopk));
	}
}
