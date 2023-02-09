package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import service.UsuarioService;
import model.Usuario;
import java.util.List;

@RestController
public class UsuarioControler {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping(value = "usuario", produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> retrieveUsuario(){
		return usuarioService.retrieveUsuario();
	}
	
	@GetMapping(value="usuario/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public Usuario retrieveUsuario(@PathVariable("id") int id){
		return usuarioService.retrieveUsuario(id);
	}
	//INSERTA
	@PostMapping(value="usuario", produces=MediaType.TEXT_PLAIN_VALUE)
	public String saveUsuario(@RequestBody Usuario usuario){
		return String.valueOf(usuarioService.addUsuario(usuario));
	}
	//UPDATE
	@PutMapping(value="usuario", produces=MediaType.APPLICATION_JSON_VALUE)
	public String updateUsuario(@RequestBody Usuario usuario){
		return String.valueOf(usuarioService.updateUsuario(usuario));
	}
	
	@DeleteMapping(value="usuario/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public String deleteUsuario(@PathVariable("id") int idUsuario){
		return String.valueOf(usuarioService.deleteUsuario(idUsuario));
	}	
	
	

}
