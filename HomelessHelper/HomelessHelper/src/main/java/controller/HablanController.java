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

import service.HablanService;
import model.Hablan;
import model.HablanPK;

@RestController
public class HablanController {
	@Autowired
	HablanService hablanservice;

	@GetMapping(value = "chats", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hablan> retrieveHablans() {
		return hablanservice.retrieveHablan();
	}

	@GetMapping(value = "chat/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hablan retrieveHablan(@PathVariable("email") HablanPK hablanpk) {
		return hablanservice.retrieveHablan(hablanpk);
	}

	@PostMapping(value = "newChat", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveHablan(@RequestBody Hablan hablan) {
		return String.valueOf(hablanservice.addHablan(hablan));
	}

	@PutMapping(value = "actualizarChat", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateHablan(@RequestBody Hablan hablan) {
		return String.valueOf(hablanservice.updateHablan(hablan));
	}

	@DeleteMapping(value = "chat/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteHablan(@PathVariable("email") HablanPK hablanpk) {
		return String.valueOf(hablanservice.deleteHablan(hablanpk));
	}
}
