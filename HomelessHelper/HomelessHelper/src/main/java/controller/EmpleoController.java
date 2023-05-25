/*
 * 
 * Controlador de los EndPoints del modelo empleo,
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

import service.EmpleoService;
import model.Credenciales;
import model.Empleo;
import model.Tipoempleo;
import model.Usuario;

import java.util.Collections;
import java.util.List;

@RestController
public class EmpleoController {
	@Autowired
	EmpleoService empleoService;

	@GetMapping(value = "empleos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleo> retrieveEmpleo() {

		List<Empleo> empleos = empleoService.retrieveEmpleo();
		empleos.sort((o1, o2) -> o1.getFecha().compareTo(o2.getFecha()));
		
		return empleos;
	}

	@GetMapping(value = "empleo/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Empleo retrieveEmpleo(@PathVariable("id") int id) {
		return empleoService.retrieveEmpleo(id);
	}

	@PostMapping(value = "addEmpleo", produces = MediaType.APPLICATION_JSON_VALUE)
	public Empleo saveEmpleo(@RequestBody Empleo empleo) {

		if (empleoService.addEmpleo(empleo)) {
			return empleo;
		} else {
			Empleo nullEmpleo = new Empleo();
			return nullEmpleo;
		}
	}

	@PutMapping(value = "updateEmpleo", produces = MediaType.APPLICATION_JSON_VALUE)
	public Empleo updateEmpleo(@RequestBody Empleo empleo) {

		if (empleoService.updateEmpleo(empleo)) {
			return empleo;
		} else {
			Empleo nullEmpleo = new Empleo();
			return nullEmpleo;
		}
	}

	@DeleteMapping(value = "eliminarEmpleo/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean deleteEmpleo(@PathVariable("id") int idEmpleo) {
		return empleoService.deleteEmpleo(idEmpleo);
	}

	@PostMapping(value = "getEmpleoByTipo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleo> getEmpleosPorTipo(@RequestBody Tipoempleo tipoempleo) {

		List<Empleo> empleos = empleoService.getEmpleosPorTipo(tipoempleo.getId());

		Collections.reverse(empleos);

		return empleos;
	}

	@PostMapping(value = "searchEmpleos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleo> findEmpleosByWord(@RequestBody Credenciales valor) {

		return empleoService.findEmpleosByWord(valor.getValor());
	}

	@PostMapping(value = "myEmpleos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleo> findEmpleosByEmail(@RequestBody Usuario email) {

		return empleoService.findEmpleosByEmail(email.getEmail());
	}
}
