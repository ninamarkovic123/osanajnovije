package api.prodavnica.dto;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class PorudzbinaDTO implements Serializable {
private Long id;
	
	private Date sat;
	
	private Boolean dostavljeno;
	
	private String komentar;
	
	private Boolean anonimanKomentar;
	
	private Boolean arhiviranKomentar;
	
	public PorudzbinaDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getSat() {
		return sat;
	}

	public void setSat(Date sat) {
		this.sat = sat;
	}

	public Boolean getDostavljeno() {
		return dostavljeno;
	}

	public void setDostavljeno(Boolean dostavljeno) {
		this.dostavljeno = dostavljeno;
	}

	public String getKomentar() {
		return komentar;
	}

	public void setKomentar(String komentar) {
		this.komentar = komentar;
	}

	public Boolean getAnonimanKomentar() {
		return anonimanKomentar;
	}

	public void setAnonimanKomentar(Boolean anonimanKomentar) {
		this.anonimanKomentar = anonimanKomentar;
	}

	public Boolean getArhiviranKomentar() {
		return arhiviranKomentar;
	}

	public void setArhiviranKomentar(Boolean arhiviranKomentar) {
		this.arhiviranKomentar = arhiviranKomentar;
	}
	
}
