package api.prodavnica.converter;

import org.springframework.stereotype.Component;

import	api.prodavnica.dto.KorisnikDTO;
import api.prodavnica.model.Kupac;
import api.prodavnica.model.Prodavac;
import api.prodavnica.model.TipKorisnika;

@Component
public class KorisnikKonverter {

	public KorisnikDTO toDTOKupac(Kupac kupac) {
		KorisnikDTO dto = new KorisnikDTO();
		dto.setId(kupac.getId());
		dto.setIme(kupac.getIme());
		dto.setPrezime(kupac.getPrezime());
		dto.setKorisnickoime(kupac.getKorisnickoime());
		dto.setLozinka(kupac.getLozinka());
		dto.setTipKorisnika(kupac.getTipKorisnika());
		dto.setBlocked(kupac.getBlocked());
		dto.setAdresa(kupac.getAdresa());

		return dto;
	}
	
	public KorisnikDTO toDTOProdavac(Prodavac prodavac) {
		KorisnikDTO dto = new KorisnikDTO();
		dto.setId(prodavac.getId());
		dto.setIme(prodavac.getIme());
		dto.setPrezime(prodavac.getPrezime());
		dto.setKorisnickoime(prodavac.getKorisnickoime());
		dto.setLozinka(prodavac.getLozinka());
		dto.setTipKorisnika(prodavac.getTipKorisnika());
		dto.setBlocked(prodavac.getBlocked());
		dto.setAdresa(prodavac.getAdresa());
		dto.setDatumOd(prodavac.getDatumOd());
		dto.setEmail(prodavac.getEmail());
		
		
		return dto;
	}
	
	public Kupac toKupac(KorisnikDTO korisnikDTO) {
		Kupac k = new Kupac();
		k.setId(korisnikDTO.getId());
		k.setIme(korisnikDTO.getIme());
		k.setPrezime(korisnikDTO.getPrezime());
		k.setKorisnickoime(korisnikDTO.getKorisnickoime());
		k.setLozinka(korisnikDTO.getLozinka());
		k.setTipKorisnika(TipKorisnika.KUPAC);
		k.setBlocked(korisnikDTO.getBlocked());
		k.setAdresa(korisnikDTO.getAdresa());

		return k;
	}
	
	public Prodavac toProdavac(KorisnikDTO korisnikDTO) {
		Prodavac p = new Prodavac();
		p.setId(korisnikDTO.getId());
		p.setIme(korisnikDTO.getIme());
		p.setPrezime(korisnikDTO.getPrezime());
		p.setKorisnickoime(korisnikDTO.getKorisnickoime());
		p.setLozinka(korisnikDTO.getLozinka());
		p.setTipKorisnika(TipKorisnika.PRODAVAC);
		p.setBlocked(korisnikDTO.getBlocked());
		p.setAdresa(korisnikDTO.getAdresa());
		p.setDatumOd(korisnikDTO.getDatumOd());
		p.setEmail(korisnikDTO.getEmail());
		

		return p;
	}
}


