package api.prodavnica.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Prodavac extends Korisnik {


	private static final long serialVersionUID = 1L;

	
	@Column(name = "datumOd", unique = false, nullable = true)
	private Date datumOd;
	
	@Column(name = "email", unique = false, nullable = true)
	private String email;
	
	@Column(name = "adresa", unique = false, nullable = false)
	private String adresa;
	
	@Column(name = "ime", unique = false, nullable = true)
	private String ime;
	
	@OneToMany(cascade= {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "prodavac")
	private Set<Artikal> artikli = new HashSet<Artikal>();
	
	@OneToMany(cascade= {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "prodavac")
	private Set<Prodaja> prodaja = new HashSet<Prodaja>();
	
	public Prodavac() {
		super();

	}

	public Prodavac(Date datumOd, String email, String adresa, String ime) {
		super();
		this.datumOd = datumOd;
		this.email = email;
		this.adresa = adresa;
		this.ime = ime;
	}

	public Prodavac(Date datumOd, String email, String adresa, String ime, Set<Artikal> artikli) {
		super();
		this.datumOd = datumOd;
		this.email = email;
		this.adresa = adresa;
		this.ime = ime;
		this.artikli = artikli;
	}

	public Date getDatumOd() {
		return datumOd;
	}

	public void setDatumOd(Date datumOd) {
		this.datumOd = datumOd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Set<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(Set<Artikal> artikli) {
		this.artikli = artikli;
	}

	public Set<Prodaja> getProdaja() {
		return prodaja;
	}

	public void setProdaja(Set<Prodaja> prodaja) {
		this.prodaja = prodaja;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
