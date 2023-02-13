package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Ofertaempleo;

@Service
public interface OfertaempleoDao {
	void addOfertaempleo(Ofertaempleo ofertaempleo);

	void removeOfertaempleo(Ofertaempleo ofertaempleo);

	List<Ofertaempleo> getOfertaempleo();

	void removeOfertaempleo(int id);

	Ofertaempleo retrieveOfertaempleo(int id);

	void updateOfertaempleo(Ofertaempleo ofertaempleo);
}