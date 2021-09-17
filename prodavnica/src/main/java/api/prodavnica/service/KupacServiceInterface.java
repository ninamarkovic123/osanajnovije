package api.prodavnica.service;

import java.util.List;

import api.prodavnica.model.Kupac;

public interface KupacServiceInterface {
	
	Kupac findOne(Long kupacId);
	
	Kupac save(Kupac kupac);
	
	void remove(Long kupacId);
	
	List<Kupac> findAll();
}
