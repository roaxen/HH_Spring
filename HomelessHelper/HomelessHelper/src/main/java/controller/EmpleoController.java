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

import java.util.Collections;
import java.util.List;

@RestController
public class EmpleoController {
	@Autowired
	EmpleoService empleoService;

	@GetMapping(value = "empleos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleo> retrieveEmpleo() {

		List<Empleo> empleoes = empleoService.retrieveEmpleo();
		Collections.reverse(empleoes);
		return empleoes;
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

	@GetMapping(value = "getEmpleoByTipo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleo> getEmpleoesPorTipo(@RequestBody Tipoempleo idTipoEmpleo) {

		List<Empleo> empleoes = empleoService.getEmpleoesPorTipo(idTipoEmpleo.getId());
		Collections.reverse(empleoes);
		return empleoes;
	}

	@GetMapping(value = "searchEmpleoes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empleo> findEmpleoesByWord(@RequestBody Credenciales valor) {

		return empleoService.findEmpleoesByWord(valor.getValor());
	}
}
