package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Tipolugar;
import service.TipolugarService;

@RestController
public class TipolugarController {

	@Autowired
	TipolugarService tipolugarService;

	@GetMapping(value = "tiposLugar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tipolugar> retrieveLugar() {
		return tipolugarService.retrieveTipolugar();
	}

	@GetMapping(value = "tipoLugar/{idTipolugar}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Tipolugar retrieveLugar(@PathVariable int idTipolugar) {
		return tipolugarService.getTipoLugar(idTipolugar);
	}
}
