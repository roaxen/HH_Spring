package service;

import org.springframework.stereotype.Service;

import model.Tipolugar;

@Service
public interface TipolugarService {

	Tipolugar getTipoLugar(String descripcion);
}
