package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Consultar;

@Service
public interface ConsultarDao {
	void addConsultar(Consultar consultar);

	void removeConsultar(Consultar consultar);

	List<Consultar> getConsultar();

	void removeConsultar(int id);

	Consultar retrieveConsultar(int id);

	void updateConsultar(Consultar Consultar);
}