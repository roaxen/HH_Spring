package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import model.Tipolugar;

public interface TipolugarJpaSpring extends JpaRepository<Tipolugar, String>{

	@Query("SELECT t FROM Tipolugar t WHERE t.descripcion = ?1")
	Tipolugar selectTipoLugar(String descripcion);
}
