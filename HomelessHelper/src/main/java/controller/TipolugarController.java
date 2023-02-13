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

import service.TipolugarService;
import model.Tipolugar;

@RestController
public class TipolugarController {
	@Autowired
	TipolugarService tipolugarservice;

	@GetMapping(value = "tipolugar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tipolugar> retrieveTiposlugar() {
		return tipolugarservice.retrieveTipolugar();
	}

	@GetMapping(value = "tipolugar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Tipolugar retrieveTipolugar(@PathVariable("id") int id) {
		return tipolugarservice.retrieveTipolugar(id);
	}

	@PostMapping(value = "tipolugar", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveTipolugar(@RequestBody Tipolugar tipolugar) {
		return String.valueOf(tipolugarservice.addTipolugar(tipolugar));
	}

	@PutMapping(value = "tipolugar", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateTipolugar(@RequestBody Tipolugar tipolugar) {
		return String.valueOf(tipolugarservice.updateTipolugar(tipolugar));
	}

	@DeleteMapping(value = "tipolugar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteTipolugar(@PathVariable("id") int id) {
		return String.valueOf(tipolugarservice.deleteTipolugar(id));
	}
}
