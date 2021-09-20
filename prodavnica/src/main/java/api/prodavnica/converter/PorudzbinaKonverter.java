package api.prodavnica.converter;

import org.springframework.stereotype.Component;

import api.prodavnica.dto.PorudzbinaDTO;
import api.prodavnica.model.Porudzbina;

@Component
public class PorudzbinaKonverter {
	public PorudzbinaDTO toDTO(Porudzbina porudzbina) {
		PorudzbinaDTO dto = new PorudzbinaDTO();
		dto.setId(porudzbina.getId());
		dto.setSat(porudzbina.getSat());
		dto.setDostavljeno(porudzbina.getDostavljeno());
		dto.setKomentar(porudzbina.getKomentar());
		dto.setAnonimanKomentar(porudzbina.getAnonimanKomentar());
		dto.setArhiviranKomentar(porudzbina.getArhivanKomentar());
	
		return dto;
	}
	
	public Porudzbina toPorudzbina(PorudzbinaDTO porudzbinaDTO) {
		Porudzbina p = new Porudzbina();
		p.setId(porudzbinaDTO.getId());
		p.setSat(porudzbinaDTO.getSat());
		p.setDostavljeno(porudzbinaDTO.getDostavljeno());
		p.setKomentar(porudzbinaDTO.getKomentar());
		p.setAnonimanKomentar(porudzbinaDTO.getAnonimanKomentar());
		p.setArhivanKomentar(porudzbinaDTO.getArhiviranKomentar());

		return p;
	}

}
