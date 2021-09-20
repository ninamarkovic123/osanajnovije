package api.prodavnica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.prodavnica.converter.KorisnikKonverter;
import api.prodavnica.service.KupacServiceInterface;
import api.prodavnica.service.ProdavacServiceInterface;
import api.prodavnica.dto.KorisnikDTO;
import api.prodavnica.model.Kupac;
import api.prodavnica.model.Prodavac;
import api.prodavnica.model.TipKorisnika;

@RestController
@RequestMapping(value="delivery/korisnici")
public class KorisnikController {
	@Autowired
	private KupacServiceInterface kupacServiceInterface;
	
	@Autowired
	private ProdavacServiceInterface prodavacServiceInterface;
	
	@Autowired
	KorisnikKonverter korisnikKonverter;
	
	@GetMapping(value="/all")
	public ResponseEntity<List<KorisnikDTO>> getKorisnici(){
		List<Prodavac> prodavci = prodavacServiceInterface.findAll();
		List<KorisnikDTO> prodavciDTO = new ArrayList<KorisnikDTO>();
		for (Prodavac p : prodavci) {
			prodavciDTO.add(korisnikKonverter.toDTOProdavac(p));
		}
		return new ResponseEntity<List<KorisnikDTO>>(prodavciDTO, HttpStatus.OK);
	}
	
	@PostMapping(consumes = "application/json", value = "/add")
	public ResponseEntity<KorisnikDTO> register(@RequestBody KorisnikDTO kDTO){
		System.out.println(kDTO.getTipKorisnika());
		if(kDTO.getTipKorisnika() == TipKorisnika.PRODAVAC) {
			Prodavac p = korisnikKonverter.toProdavac(kDTO);
			p.setBlocked(false);
			Prodavac pr = prodavacServiceInterface.save(p);
			KorisnikDTO prodavacDTO = korisnikKonverter.toDTOProdavac(pr);
			return new ResponseEntity<KorisnikDTO>(prodavacDTO, HttpStatus.CREATED);
		}
		else {
			Kupac k = korisnikKonverter.toKupac(kDTO);
			k.setBlocked(false);
			Kupac kc = kupacServiceInterface.save(k);
			KorisnikDTO kupacDTO = korisnikKonverter.toDTOKupac(kc);
			return new ResponseEntity<KorisnikDTO>(kupacDTO, HttpStatus.CREATED);
		}
	}	
}

