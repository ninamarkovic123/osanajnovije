package api.prodavnica.service;

import java.util.List;

import api.prodavnica.model.Prodavac;

public interface ProdavacServiceInterface {
	Prodavac findOne(Long prodavacId);
	
	Prodavac save(Prodavac prodavac);
	
	void remove(Long prodavacId);
	
	List<Prodavac> findAll();
}
