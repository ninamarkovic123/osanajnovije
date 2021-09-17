package api.prodavnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.prodavnica.model.Porudzbina;
import api.prodavnica.repository.PorudzbinaRepository;

@Service
public class PorudzbinaService implements PorudzbinaServiceInterface {


	@Autowired
	PorudzbinaRepository prepo;
	
	@Override
	public Porudzbina findOne(Long porudzbinaId) {
		return prepo.getOne(porudzbinaId);
	}

	@Override
	public Porudzbina save(Porudzbina porudzbina) {
		return prepo.save(porudzbina);
	}

	@Override
	public void remove(Long porudzbinaId) {
		prepo.deleteById(porudzbinaId);
	}

	@Override
	public List<Porudzbina> findAll() {
		return prepo.findAll();
	}

}
