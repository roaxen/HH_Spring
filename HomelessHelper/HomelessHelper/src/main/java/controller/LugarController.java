/*
 * 
 * Controlador de los EndPoints del modelo Lugar,
 * recibe la información y la transmite a la capa "service"
 * 
 * @Author: HomelessHelper
 * @Version 1.0.0
 * @Since 30-05-2023
 * 
 */

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
import model.Credenciales;
import model.Lugar;
import model.Tipolugar;

import java.util.Collections;
import java.util.List;

@RestController
public class LugarController {
	@Autowired
	LugarService lugarService;

	@GetMapping(value = "lugares", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lugar> retrieveLugar() {

		List<Lugar> lugares = lugarService.retrieveLugar();
		Collections.shuffle(lugares);
		return lugares;
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

	@PostMapping(value = "getLugarByTipo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lugar> getLugaresPorTipo(@RequestBody Tipolugar idTipoLugar) {

		List<Lugar> lugares = lugarService.getLugaresPorTipo(idTipoLugar.getIdTipolugar());
		Collections.shuffle(lugares);
		return lugares;
	}

	@PostMapping(value = "searchLugares", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lugar> findLugaresByWord(@RequestBody Credenciales valor) {

		return lugarService.findLugaresByWord(valor.getValor());
	}
}
