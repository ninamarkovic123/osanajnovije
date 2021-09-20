package api.prodavnica.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import api.prodavnica.dto.StavkaDTO;
import api.prodavnica.model.Stavka;
import api.prodavnica.service.ArtikalServiceInterface;
import api.prodavnica.service.PorudzbinaServiceInterface;

@Component
public class StavkaConverter {
	@Autowired
	private ArtikalKonverter artikalKonverter;
	
	@Autowired
	private ArtikalServiceInterface artikalServiceInterface;
	
	@Autowired
	private PorudzbinaKonverter porudzbinaKonverter;
	
	@Autowired
	private PorudzbinaServiceInterface porudzbinaServiceInterface;
	
	public StavkaDTO toDTO(Stavka stavka) {
		StavkaDTO dto = new StavkaDTO();
		dto.setId(stavka.getId());
		dto.setKolicina(stavka.getKolicina());
		dto.setPorudzbinaDTO(porudzbinaKonverter.toDTO(stavka.getPorudzbina()));
		dto.setArtikalDTO(artikalKonverter.toDTO(stavka.getArtikal()));
		return dto;
	}
	
	public Stavka toStavka(StavkaDTO stavkaDTO) {
		Stavka s = new Stavka();
		s.setId(stavkaDTO.getId());
		s.setKolicina(stavkaDTO.getKolicina());
		s.setPorudzbina(porudzbinaServiceInterface.findOne(stavkaDTO.getPorudzbinaDTO().getId()));
		s.setArtikal(artikalServiceInterface.findOne(stavkaDTO.getArtikalDTO().getId()));
		return s;
	}

}


