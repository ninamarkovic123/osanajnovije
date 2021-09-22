package api.prodavnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.prodavnica.model.Korisnik;
import api.prodavnica.repository.KorisnikRepository;
@Service
public class KorisnikService implements KorisnikServiceInterface{
	
	@Autowired
	KorisnikRepository kr;
	@Override
	public Korisnik findOne(Long korisnikId) {
		return kr.getOne(korisnikId);
	}

	@Override
	public Korisnik save(Korisnik korisnik) {
		return kr.save(korisnik);
	}

	@Override
	public void remove(Long korisnikId) {
		kr.deleteById(korisnikId);
	}

	@Override
	public List<Korisnik> findAll() {
		return kr.findAll();
	}

	@Override
	public Korisnik findByKorisnickoimeAndLozinka(String korisnickoime, String lozinka) {
		// TODO Auto-generated method stubreturn userRepository.findByUsernameAndPassword(username, password);
		return kr.findByKorisnickoimeAndLozinka(korisnickoime, lozinka);
	}




}
