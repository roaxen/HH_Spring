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

import service.AboutusService;
import model.Aboutus;

@RestController
public class AboutusController {
	@Autowired
	AboutusService aboutusservice;

	@GetMapping(value = "aboutuses", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Aboutus> retrieveAboutuss() {
		return aboutusservice.retrieveAboutus();
	}

	@GetMapping(value = "aboutus/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Aboutus retrieveAboutus(@PathVariable("id") int id) {
		return aboutusservice.retrieveAboutus(id);
	}

	@PostMapping(value = "newAboutus", produces = MediaType.APPLICATION_JSON_VALUE)
	public Aboutus saveAboutus(@RequestBody Aboutus aboutus) {
		if (String.valueOf(aboutusservice.addAboutus(aboutus)) != null) {
			return aboutus;
		} else {
			Aboutus nullAboutus = new Aboutus();
			return nullAboutus;
		}
	}

	@PutMapping(value = "changeAboutus", produces = MediaType.APPLICATION_JSON_VALUE)
	public Aboutus updateAboutus(@RequestBody Aboutus aboutus) {
		if (String.valueOf(aboutusservice.updateAboutus(aboutus)) != null) {
			return aboutus;
		} else {
			Aboutus nullAboutus = new Aboutus();
			return nullAboutus;
		}
	}

	@DeleteMapping(value = "aboutus/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteAboutus(@PathVariable("id") int id) {
		return String.valueOf(aboutusservice.deleteAboutus(id));
	}
}
