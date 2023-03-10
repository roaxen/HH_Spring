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

import service.UsuarioService;
import model.Usuario;
import model.Credenciales;

@RestController
public class UsuarioController {
	@Autowired
	UsuarioService usuarioservice;

	@GetMapping(value = "profiles", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> retrieveUsuarios() {
		return usuarioservice.retrieveUsuarios();
	}
//	@GetMapping(value = "profiles", produces = MediaType.APPLICATION_JSON_VALUE)
//	public String retrieveUsuarios() {
//		System.out.println(usuarioservice.retrieveUsuarios());
//		return " 555";
//	}

	@PostMapping(value = "login", produces = MediaType.APPLICATION_JSON_VALUE)
	public Usuario loginUsuario(@RequestBody Credenciales credenciales) {
		Usuario user = usuarioservice.checkUserExists(credenciales.getEmail(), credenciales.getClave());
		user.setClave(null);
		return user;

	}

	@GetMapping(value = "profile/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Usuario retrieveUsuario(@PathVariable("email") String email) {
		return usuarioservice.retrieveUsuario(email);

	}

	@PostMapping(value = "signin", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saveUsuario(@RequestBody Usuario usuario) {
		return String.valueOf(usuarioservice.addUsuario(usuario));
	}

	@PutMapping(value = "profile", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateUsuario(@RequestBody Usuario usuario) {
		return String.valueOf(usuarioservice.updateUsuario(usuario));
	}

	@PutMapping(value = "changeUserPwd", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updatePassword(@RequestBody Credenciales credenciales) {
		return String.valueOf(usuarioservice.updatePassword(credenciales.getEmail(), credenciales.getClave(),
				credenciales.getNew_clave()));
	}

	@DeleteMapping(value = "user/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteUsuario(@PathVariable("email") String email) {
		return String.valueOf(usuarioservice.deleteUsuario(email));
	}
}