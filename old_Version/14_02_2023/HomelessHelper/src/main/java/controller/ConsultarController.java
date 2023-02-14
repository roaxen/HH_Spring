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

import service.ConsultarService;
import model.Consultar;

@RestController
public class ConsultarController {
	@Autowired
	ConsultarService consultarservice;

	@GetMapping(value = "consultar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Consultar> retrieveConsultas() {
		return consultarservice.retrieveConsultar();
	}

	@GetMapping(value = "consultar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Consultar retrieveConsulta(@PathVariable("id") int id) {
		return consultarservice.retrieveConsultar(id);
	}

	@PostMapping(value = "consultar", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveConsultar(@RequestBody Consultar consultar) {
		return String.valueOf(consultarservice.addConsultar(consultar));
	}

	@PutMapping(value = "consultar", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateConsulta(@RequestBody Consultar consultar) {
		return String.valueOf(consultarservice.updateConsultar(consultar));
	}

	@DeleteMapping(value = "consultar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteConsultar(@PathVariable("id") int id) {
		return String.valueOf(consultarservice.deleteConsultar(id));
	}
}
