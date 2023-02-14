package dao;

import java.util.List;

import org.springframework.stereotype.Service;

import model.Tipolugar;

@Service
public interface TipolugarDao {
	void addTipolugar(Tipolugar tipolugar);

	void removeTipolugar(Tipolugar tipolugar);

	List<Tipolugar> getTipolugar();

	void removeTipolugar(int id);

	Tipolugar retrieveTipolugar(int id);

	void updateTipolugar(Tipolugar tipolugar);
}