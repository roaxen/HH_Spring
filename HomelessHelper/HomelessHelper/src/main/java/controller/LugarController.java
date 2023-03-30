package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import service.LugarService;
import service.TipolugarService;
import model.Lugar;

import java.util.List;

@RestController
public class LugarController {
	@Autowired
	LugarService lugarService;

	@Autowired
	TipolugarService tipolugarService;

	@GetMapping(value = "lugares", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lugar> retrieveLugar() {
		return lugarService.retrieveLugar();
	}

	@GetMapping(value = "lugar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Lugar retrieveLugar(@PathVariable("id") int id) {
		return lugarService.retrieveLugar(id);
	}

	@PostMapping(value = "addLugar", produces = MediaType.APPLICATION_JSON_VALUE)
	public Lugar saveLugar(@RequestBody Lugar lugar) {
		
		if (lugarService.addLugar(lugar)) {
			return lugar;
		} else {
			Lugar nullLugar = new Lugar();
			return nullLugar;
		}
	}

	@PutMapping(value = "updateLugar", produces = MediaType.APPLICATION_JSON_VALUE)
	public Lugar updateLugar(@RequestBody Lugar lugar) {

		if (lugarService.updateLugar(lugar)) {
			return lugar;
		} else {
			Lugar nullLugar = new Lugar();
			return nullLugar;
		}
	}

	@DeleteMapping(value = "eliminarLugar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean deleteLugar(@PathVariable("id") int idLugar) {
		return lugarService.deleteLugar(idLugar);
	}

}
