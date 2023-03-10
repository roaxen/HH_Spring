package service;

import java.util.List;

import model.Ofertaempleo;

public interface OfertaempleoService {
	boolean addOfertaempleo(Ofertaempleo ofertaempleo);

	List<Ofertaempleo> retrieveOfertaempleo();

	boolean updateOfertaempleo(Ofertaempleo ofertaempleo);

	boolean deleteOfertaempleo(int id);

	Ofertaempleo retrieveOfertaempleo(int id);
}