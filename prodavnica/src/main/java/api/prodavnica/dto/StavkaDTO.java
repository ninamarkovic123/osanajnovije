package api.prodavnica.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class StavkaDTO implements Serializable {
	private Long id;
	
	private Integer kolicina;
	
	private PorudzbinaDTO porudzbinaDTO;
	
	private ArtikalDTO artikalDTO;
	
	public StavkaDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getKolicina() {
		return kolicina;
	}

	public void setKolicina(Integer kolicina) {
		this.kolicina = kolicina;
	}

	public PorudzbinaDTO getPorudzbinaDTO() {
		return porudzbinaDTO;
	}

	public void setPorudzbinaDTO(PorudzbinaDTO porudzbinaDTO) {
		this.porudzbinaDTO = porudzbinaDTO;
	}

	public ArtikalDTO getArtikalDTO() {
		return artikalDTO;
	}

	public void setArtikalDTO(ArtikalDTO artikalDTO) {
		this.artikalDTO = artikalDTO;
	}
	
}
