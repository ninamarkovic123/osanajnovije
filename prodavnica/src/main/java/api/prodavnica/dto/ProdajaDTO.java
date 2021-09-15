package api.prodavnica.dto;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ProdajaDTO implements Serializable{
private Long id;
	
	private String procenat;
	
	private Date datumOd;
	
	private Date datumDo;
	
	private String text;
	
	private KorisnikDTO korisnikDTO;
		
	public ProdajaDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProcenat() {
		return procenat;
	}

	public void setProcenat(String procenat) {
		this.procenat = procenat;
	}

	public Date getDatumOd() {
		return datumOd;
	}

	public void setDatumOd(Date datumOd) {
		this.datumOd = datumOd;
	}

	public Date getDatumDo() {
		return datumDo;
	}

	public void setDatumDo(Date datumDo) {
		this.datumDo = datumDo;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public KorisnikDTO getKorisnikDTO() {
		return korisnikDTO;
	}

	public void setKorisnikDTO(KorisnikDTO korisnikDTO) {
		this.korisnikDTO = korisnikDTO;
	}
	
}
