package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Tipoempleo;
import service.TipoempleoService;

@RestController
public class TipoempleoController {

	@Autowired
	TipoempleoService tipoempleoService;

	@GetMapping(value = "tiposEmpleo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tipoempleo> retrieveEmpleo() {
		return tipoempleoService.retrieveTipoempleo();
	}

	@GetMapping(value = "tipoEmpleo/{idTipoempleo}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Tipoempleo retrieveEmpleo(@PathVariable int idTipoempleo) {
		return tipoempleoService.getTipoEmpleo(idTipoempleo);
	}
}
