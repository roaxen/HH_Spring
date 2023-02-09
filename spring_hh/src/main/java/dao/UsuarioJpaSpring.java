package dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Usuario;


@Service
public interface UsuarioJpaSpring extends JpaRepository<Usuario, Integer> { // El segundo campo es el tipo de la clave primaria 
	
	@Transactional
	@Modifying
	@Query("delete from Usuario u Where u.email=?1") // Usuario no es el nombre de la tabla es el Objeto Usuario 
	// esto lo puedo meter como sql ??
	void removeByName(String email);
	
	/*
	@Transactional
	@Modifying
	@Query("select from Usuario u Where u.email=?1") // Usuario no es el nombre de la tabla es el Objeto Usuario 
	// esto lo puedo meter como sql ??
	void selectbyEmail(String email);
	*/
}
