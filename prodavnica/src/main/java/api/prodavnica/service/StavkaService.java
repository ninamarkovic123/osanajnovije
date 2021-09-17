package api.prodavnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.prodavnica.model.Stavka;
import api.prodavnica.repository.StavkaRepository;

@Service
public class StavkaService implements StavkaServiceInterface {

	@Autowired
	StavkaRepository srepo;
	
	@Override
	public Stavka findOne(Long stavkaId) {
		return srepo.getOne(stavkaId);
	}

	@Override
	public Stavka save(Stavka stavka) {
		return srepo.save(stavka);
	}

	@Override
	public void remove(Long stavkaId) {
		srepo.deleteById(stavkaId);
	}

	@Override
	public List<Stavka> findAll() {
		return srepo.findAll();
	}

}
