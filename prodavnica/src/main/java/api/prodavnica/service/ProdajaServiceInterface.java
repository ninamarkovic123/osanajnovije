package api.prodavnica.service;

import java.util.List;

import api.prodavnica.model.Prodaja;

public interface ProdajaServiceInterface {

	Prodaja findOne(Long prodajaId);
	
	Prodaja save(Prodaja prodaja);
	
	void remove(Long prodajaId);
	
	List<Prodaja> findAll();
	
}
