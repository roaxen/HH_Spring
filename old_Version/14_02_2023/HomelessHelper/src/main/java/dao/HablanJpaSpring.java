package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Aboutus;
import model.Hablan;

public interface HablanJpaSpring extends JpaRepository<Aboutus,Integer>{

	void save(Hablan hablan);

	void delete(Hablan hablan);
}
