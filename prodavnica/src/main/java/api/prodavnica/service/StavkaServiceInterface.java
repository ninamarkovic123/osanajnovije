package api.prodavnica.service;

import java.util.List;

import api.prodavnica.model.Stavka;

public interface StavkaServiceInterface {
	
	Stavka findOne(Long stavkaId);
	
	Stavka save(Stavka stavka);
	
	void remove(Long stavkaId);
	
	List<Stavka> findAll();
}
