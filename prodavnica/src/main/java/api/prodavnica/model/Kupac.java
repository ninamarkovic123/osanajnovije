package api.prodavnica.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Kupac extends Korisnik {


	private static final long serialVersionUID = 1L;

	@Column(name = "adresa", unique = false, nullable = false)
	private String adresa;
		
	@OneToMany(cascade= {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "kupac")
	private Set<Porudzbina> porudzbine = new HashSet<Porudzbina>();

	
	public String getAdresa() {
		return adresa;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public Set<Porudzbina> getPorudzbine() {
		return porudzbine;
	}


	public void setPorudzbine(Set<Porudzbina> porudzbine) {
		this.porudzbine = porudzbine;
	}


	public Kupac() {
		super();
	}


	public Kupac(Long id, String ime, String prezime, String korisnickoime, String lozinka, TipKorisnika tipKorisnika) {
		super(id, ime, prezime, korisnickoime, lozinka, tipKorisnika);
	}


	public Kupac(Long id, String ime, String prezime, String korisnickoime, String lozinka, TipKorisnika tipKorisnika,
			String adresa) {
		super(id, ime, prezime, korisnickoime, lozinka, tipKorisnika);
		this.adresa = adresa;
	}
		
	
}
