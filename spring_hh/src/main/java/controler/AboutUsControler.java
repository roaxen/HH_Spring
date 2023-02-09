package controler;

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

import model.Aboutus;
import model.Usuario;
import service.AboutUsService;
@RestController
public class AboutUsControler {
	@Autowired
	AboutUsService aboutUsService;
	
	
	@GetMapping(value = "about", produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Aboutus > retrieveAboutus(){
		return aboutUsService.retrieveAboutus();
	}

	@GetMapping(value="about/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Aboutus retrieveAboutus(@PathVariable("id") int id){
		return aboutUsService.retrieveAboutus(id);
	}
	//INSERTA
	@PostMapping(value="about", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saveAboutus(@RequestBody Aboutus usuario){
		return String.valueOf(aboutUsService.addAboutus(usuario));
	}
	//UPDATE
	@PutMapping(value="about", produces=MediaType.APPLICATION_JSON_VALUE)
	public String updateAboutus(@RequestBody Aboutus usuario){
		return String.valueOf(aboutUsService.updateAboutus(usuario));
	}
	
	@DeleteMapping(value="about/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public String deleteAboutus(@PathVariable("id") int idUsuario){
		return String.valueOf(aboutUsService.deleteAboutus(idUsuario));
	}	
	
}
