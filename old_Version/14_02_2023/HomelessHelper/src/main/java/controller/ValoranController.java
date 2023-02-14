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

import service.ValoranService;
import model.Valoran;

@RestController
public class ValoranController {
	@Autowired
	ValoranService valoranservice;

	@GetMapping(value = "valoran", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Valoran> retrieveValorans() {
		return valoranservice.retrieveValoran();
	}

	@GetMapping(value = "valoran/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Valoran retrieveValoran(@PathVariable("id") int id) {
		return valoranservice.retrieveValoran(id);
	}

	@PostMapping(value = "valoran", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveValoran(@RequestBody Valoran valoran) {
		return String.valueOf(valoranservice.addValoran(valoran));
	}

	@PutMapping(value = "valoran", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateValoran(@RequestBody Valoran valoran) {
		return String.valueOf(valoranservice.updateValoran(valoran));
	}

	@DeleteMapping(value = "valoran/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteValoran(@PathVariable("id") int id) {
		return String.valueOf(valoranservice.deleteValoran(id));
	}
}
