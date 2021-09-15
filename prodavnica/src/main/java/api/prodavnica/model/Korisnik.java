package api.prodavnica.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.Table;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@Table(name="korisnici")
public class Korisnik implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="korisnikId", unique = true, nullable = false)
	private Long id;

	@Column(name = "ime", unique = false, nullable = false)
	private String ime;
	
	@Column(name = "prezime", unique = false, nullable = false)
	private String prezime;
	
	@Column(name = "korisnickoime", unique = false, nullable = false)
	private String korisnickoime;
	
	@Column(name = "lozinka", unique = false, nullable = false)
	private String lozinka;
	
	@Column(name="TipKorisnika", unique = false, nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private TipKorisnika tipKorisnika;
	
	@Column(name="blocked", unique = false, nullable = false)
	private Boolean blocked;
	
	public Korisnik() {
		
	}

	public Korisnik(Long id, String ime, String prezime, String korisnickoime, String lozinka,
			TipKorisnika tipKorisnika) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoime = korisnickoime;
		this.lozinka = lozinka;
		this.tipKorisnika = tipKorisnika;
	}


	
	

	public Korisnik(Long id, String ime, String prezime, String korisnickoime, String lozinka,
			TipKorisnika tipKorisnika, Boolean blocked) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoime = korisnickoime;
		this.lozinka = lozinka;
		this.tipKorisnika = tipKorisnika;
		this.blocked = blocked;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getKorisnickoime() {
		return korisnickoime;
	}

	public void setKorisnickoime(String korisnickoime) {
		this.korisnickoime = korisnickoime;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public TipKorisnika getTipKorisnika() {
		return tipKorisnika;
	}

	public void setTipKorisnika(TipKorisnika tipKorisnika) {
		this.tipKorisnika = tipKorisnika;
	}

	public Boolean getBlocked() {
		return blocked;
	}

	public void setBlocked(Boolean blocked) {
		this.blocked = blocked;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}





}
