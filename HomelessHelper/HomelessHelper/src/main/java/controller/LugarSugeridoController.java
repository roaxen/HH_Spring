/*
 * 
 * Controlador de los EndPoints del modelo Lugarsugerido,
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

import service.LugarSugeridoService;
import model.Credenciales;
import model.Lugarsugerido;
import model.Tipolugar;

import java.util.Collections;
import java.util.List;

@RestController
public class LugarSugeridoController {
	@Autowired
	LugarSugeridoService lugarService;

	@GetMapping(value = "lugaresSug", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lugarsugerido> retrieveLugarsugerido() {

		List<Lugarsugerido> lugares = lugarService.retrieveLugarsugerido();
		Collections.shuffle(lugares);
		return lugares;
	}

	@GetMapping(value = "lugarSug/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Lugarsugerido retrieveLugarsugerido(@PathVariable("id") int id) {
		return lugarService.retrieveLugarsugerido(id);
	}

	@PostMapping(value = "addLugarsugerido", produces = MediaType.APPLICATION_JSON_VALUE)
	public Lugarsugerido saveLugarsugerido(@RequestBody Lugarsugerido lugar) {

		if (lugarService.addLugarsugerido(lugar)) {
			return lugar;
		} else {
			Lugarsugerido nullLugarsugerido = new Lugarsugerido();
			return nullLugarsugerido;
		}
	}

	@PutMapping(value = "updateLugarsugerido", produces = MediaType.APPLICATION_JSON_VALUE)
	public Lugarsugerido updateLugarsugerido(@RequestBody Lugarsugerido lugar) {

		if (lugarService.updateLugarsugerido(lugar)) {
			return lugar;
		} else {
			Lugarsugerido nullLugarsugerido = new Lugarsugerido();
			return nullLugarsugerido;
		}
	}

	@DeleteMapping(value = "eliminarLugarsugerido/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean deleteLugarsugerido(@PathVariable("id") int idLugarsugerido) {
		return lugarService.deleteLugarsugerido(idLugarsugerido);
	}
	

	@PostMapping(value = "getLugarsugeridoByTipo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lugarsugerido> getLugarsugeridoesPorTipo(@RequestBody Tipolugar idTipoLugarsugerido) {

		List<Lugarsugerido> lugares = lugarService.getLugaresPorTipo(idTipoLugarsugerido.getIdTipolugar());
		Collections.shuffle(lugares);
		return lugares;
	}

	@PostMapping(value = "searchLugarsugeridos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Lugarsugerido> findLugarsugeridoesByWord(@RequestBody Credenciales valor) {

		return lugarService.findLugaresByWord(valor.getValor());
	}
}
