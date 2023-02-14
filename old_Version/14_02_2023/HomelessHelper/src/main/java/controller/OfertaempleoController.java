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

import service.OfertaempleoService;
import model.Ofertaempleo;

@RestController
public class OfertaempleoController {
	@Autowired
	OfertaempleoService ofemservice;

	@GetMapping(value = "ofertaempleo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ofertaempleo> retrieveOfertasempleo() {
		return ofemservice.retrieveOfertaempleo();
	}

	@GetMapping(value = "ofertaempleo/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Ofertaempleo retrieveOfertaempleo(@PathVariable("id") int id) {
		return ofemservice.retrieveOfertaempleo(id);
	}

	@PostMapping(value = "ofertaempleo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveOfertaempleo(@RequestBody Ofertaempleo ofertaempleo) {
		return String.valueOf(ofemservice.addOfertaempleo(ofertaempleo));
	}

	@PutMapping(value = "ofertaempleo", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateOfertaempleo(@RequestBody Ofertaempleo ofertaempleo) {
		return String.valueOf(ofemservice.updateOfertaempleo(ofertaempleo));
	}

	@DeleteMapping(value = "ofertaempleo/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteOfertaempleo(@PathVariable("id") int id) {
		return String.valueOf(ofemservice.deleteOfertaempleo(id));
	}
}
