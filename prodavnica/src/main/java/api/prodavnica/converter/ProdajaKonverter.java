package api.prodavnica.converter;

import org.springframework.beans.factory.annotation.Autowired;

import api.prodavnica.dto.ProdajaDTO;
import api.prodavnica.model.Prodaja;
import api.prodavnica.service.KorisnikServiceInterface;

public class ProdajaKonverter {
	@Autowired
	public KorisnikKonverter korisnikKonverter;
	
	@Autowired
	KorisnikServiceInterface korisnikServiceInterface;
	
	public ProdajaDTO toDTO(Prodaja prodaja) {
		ProdajaDTO dto = new ProdajaDTO();
		dto.setId(prodaja.getId());
		dto.setProcenat(prodaja.getProcenat());
		dto.setDatumOd(prodaja.getDatumOd());
		dto.setDatumDo(prodaja.getDatumDo());
		dto.setText(prodaja.getText());
		dto.setKorisnikDTO(korisnikKonverter.toDTOProdavac(prodaja.getProdavac()));
		return dto;
	}
	
	public Prodaja toProdaja(ProdajaDTO prodajaDTO) {
		Prodaja p = new Prodaja();
		p.setId(prodajaDTO.getId());
		p.setProcenat(prodajaDTO.getProcenat());
		p.setDatumOd(prodajaDTO.getDatumOd());
		p.setText(prodajaDTO.getText());
		p.setProdavac(korisnikServiceInterface.findOne(prodajaDTO.getKorisnikDTO().getId()));
		return p;
	}

}


