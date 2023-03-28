package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Favorito;
import model.FavoritoPK;

public interface FavoritoJpaSpring extends JpaRepository<Favorito, FavoritoPK> {

	
	@Query("SELECT f FROM Favorito f WHERE f.id.email = ?1")
	Favorito findByEmail(String email);
}