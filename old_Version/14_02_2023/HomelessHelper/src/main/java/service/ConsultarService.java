package service;

import java.util.List;

import model.Consultar;

public interface ConsultarService {
	boolean addConsultar(Consultar consultar);

	List<Consultar> retrieveConsultar();

	boolean updateConsultar(Consultar consultar);

	boolean deleteConsultar(int id);

	Consultar retrieveConsultar(int id);
}