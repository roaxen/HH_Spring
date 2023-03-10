package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Valoran;

public interface ValoranJpaSpring extends JpaRepository<Valoran,Integer>{
	@Transactional
	@Modifying
	@Query("Delete from Valoran v Where v.nameV=?1")
	void removeByEmail(Integer id);
}
