package api.prodavnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.prodavnica.model.Prodavac;
import api.prodavnica.repository.ProdavacRepository;

@Service
public class ProdavacService implements ProdavacServiceInterface {

	@Autowired
	ProdavacRepository pr;
	
	@Override
	public Prodavac findOne(Long prodavacId) {
		return pr.getOne(prodavacId);
	}

	@Override
	public Prodavac save(Prodavac prodavac) {
		return pr.save(prodavac);
	}

	@Override
	public void remove(Long prodavacId) {
		pr.deleteById(prodavacId);
	}

	@Override
	public List<Prodavac> findAll() {
		return pr.findAll();
	}

}
