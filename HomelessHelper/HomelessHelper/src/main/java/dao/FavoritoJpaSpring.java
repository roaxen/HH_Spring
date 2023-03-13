package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Favorito;

public interface FavoritoJpaSpring extends JpaRepository<Favorito, String>{


}