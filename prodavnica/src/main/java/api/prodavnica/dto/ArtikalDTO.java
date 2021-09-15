package api.prodavnica.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ArtikalDTO implements Serializable {
	private Long id;
	
	private String nazivArtikla;
	
	private String opisArtikla;
	
	private Double oznakaArtikla;
	
	private String path;
	
	private Boolean deleted;
	
	private KorisnikDTO korisnikDTO;
		
	public ArtikalDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNazivArtikla() {
		return nazivArtikla;
	}

	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}

	public String getOpisArtikla() {
		return opisArtikla;
	}

	public void setOpisArtikla(String opisArtikla) {
		this.opisArtikla = opisArtikla;
	}

	public Double getOznakaArtikla() {
		return oznakaArtikla;
	}

	public void setOznakaArtikla(Double oznakaArtikla) {
		this.oznakaArtikla = oznakaArtikla;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public KorisnikDTO getKorisnikDTO() {
		return korisnikDTO;
	}

	public void setKorisnikDTO(KorisnikDTO korisnikDTO) {
		this.korisnikDTO = korisnikDTO;
	}
	

}
