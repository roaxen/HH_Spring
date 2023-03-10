package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Tipolugar;

public interface TipolugarJpaSpring extends JpaRepository<Tipolugar,Integer>{
	@Transactional
	@Modifying
	@Query("Delete from Tipolugar t Where t.nameT=?1")
	void removeByEmail(Integer id);
}
