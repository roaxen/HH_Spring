package service;

import java.util.List;

import model.Tipolugar;

public interface TipolugarService {
	boolean addTipolugar(Tipolugar tipolugar);

	List<Tipolugar> retrieveTipolugar();

	boolean updateTipolugar(Tipolugar tipolugar);

	boolean deleteTipolugar(int id);

	Tipolugar retrieveTipolugar(int id);
}