package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Consultar;

public interface ConsultarJpaSpring extends JpaRepository<Consultar,Integer>{
	@Transactional
	@Modifying
	@Query("Delete from Consultar c Where c.nameC=?1")
	void removeByEmail(Integer id);
}
