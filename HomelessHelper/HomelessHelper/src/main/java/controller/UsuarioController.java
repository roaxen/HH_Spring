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

	@PostMapping(value = "signin", produces = MediaType.APPLICATION_JSON_VALUE)
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		if (usuarioservice.addUsuario(usuario)) {
			usuario.setClave(null);
			return usuario;
		} else {
			Usuario nullUser = new Usuario();
			return nullUser;
		}
	}

	@PutMapping(value = "profile", produces = MediaType.APPLICATION_JSON_VALUE)
	public Usuario updateUsuario(@RequestBody Usuario usuario) {
		if (String.valueOf(usuarioservice.updateUsuario(usuario)) != null) {
			usuario.setClave(null);
			return usuario;
		} else {
			Usuario nullUser = new Usuario();
			return nullUser;
		}
	}

	@PutMapping(value = "changeUserPwd", produces = MediaType.APPLICATION_JSON_VALUE)
	public Usuario updatePassword(@RequestBody Credenciales credenciales) {
		if (String.valueOf(usuarioservice.updatePassword(credenciales.getEmail(), credenciales.getClave(),
				credenciales.getNew_clave())) != null) {
			Usuario user = retrieveUsuario(credenciales.getEmail());
			user.setClave(null);
			return user;
		} else {
			Usuario nullUser = new Usuario();
			return nullUser;
		}
	}

	@DeleteMapping(value = "user/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteUsuario(@PathVariable("email") String email) {
		return String.valueOf(usuarioservice.deleteUsuario(email));
	}
}