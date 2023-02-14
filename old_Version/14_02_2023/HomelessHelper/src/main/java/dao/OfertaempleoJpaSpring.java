package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Ofertaempleo;

public interface OfertaempleoJpaSpring extends JpaRepository<Ofertaempleo,Integer>{
	@Transactional
	@Modifying
	@Query("Delete from Ofertaempleo o Where o.nameO=?1")
	void removeByEmail(Integer id);
}
