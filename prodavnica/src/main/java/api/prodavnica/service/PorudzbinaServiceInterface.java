package api.prodavnica.service;

import java.util.List;

import api.prodavnica.model.Porudzbina;

public interface PorudzbinaServiceInterface {

	Porudzbina findOne(Long porudzbinaId);
	
	Porudzbina save(Porudzbina porudzbina);
	
	void remove(Long porudzbinaId);
	
	List<Porudzbina> findAll();
}
