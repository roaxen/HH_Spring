package dao;

import org.springframework.stereotype.Service;

import model.Tipolugar;

@Service
public interface TipolugarDao {

	Tipolugar getTipoLugar(String descripcion);

}
