package api.prodavnica.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import api.prodavnica.dto.ArtikalDTO;
import api.prodavnica.model.Artikal;
import api.prodavnica.service.KorisnikServiceInterface;
import api.prodavnica.service.ProdavacServiceInterface;

@Component
public class ArtikalKonverter {
	
		
		@Autowired
		public KorisnikKonverter korisnikKonverter;
		
		@Autowired
		KorisnikServiceInterface korisnikServiceInterface;
		
		@Autowired
		ProdavacServiceInterface prodavacServiceInterface;
				
		public ArtikalDTO toDTO(Artikal artikal) {
			ArtikalDTO dto = new ArtikalDTO();
			dto.setId(artikal.getId());
			dto.setNazivArtikla(artikal.getNazivArtikla());
			dto.setOpisArtikla(artikal.getOpisArtikla());
			dto.setOznakaArtikla(artikal.getOznakaArtikla());
			dto.setPath(artikal.getPath());
			dto.setDeleted(artikal.getDeleted());
			dto.setKorisnikDTO(korisnikKonverter.toDTOProdavac(artikal.getProdavac()));
			return dto;
		}
		
		public Artikal toArtikal(ArtikalDTO artikalDTO) {
			Artikal a = new Artikal();
			a.setId(artikalDTO.getId());
			a.setNazivArtikla(artikalDTO.getNazivArtikla());
			a.setOpisArtikla(artikalDTO.getOpisArtikla());
			a.setOpisArtikla(artikalDTO.getOpisArtikla());
			a.setPath(artikalDTO.getPath());
			a.setDeleted(artikalDTO.getDeleted());
			a.setProdavac(prodavacServiceInterface.findOne(artikalDTO.getKorisnikDTO().getId()));
			return a;
		}

	}

