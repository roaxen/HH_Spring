package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import model.Empleo;

@Service
public interface EmpleoJpaSpring extends JpaRepository<Empleo, Integer> {

	@Query("SELECT e FROM Empleo e WHERE e.idTipoempleo = :idTipoempleo")
	List<Empleo> findEmpleoesByTipoEmpleo(@Param("idTipoempleo") int idTipoempleo);

	@Query("SELECT e FROM Empleo e WHERE e.email = :email")
	List<Empleo> findEmpleoesByEmail(@Param("email") String email);

	@Query("SELECT e FROM Empleo e WHERE e.titulo LIKE CONCAT('%', :valor, '%') OR e.descripcion LIKE CONCAT('%', :valor, '%') OR e.localidad LIKE CONCAT('%', :valor, '%') OR e.email LIKE CONCAT('%', :valor, '%')")
	List<Empleo> findEmpleoesByWord(@Param("valor") String valor);
}
