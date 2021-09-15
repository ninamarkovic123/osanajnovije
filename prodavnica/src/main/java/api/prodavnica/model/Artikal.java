package api.prodavnica.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="artikli")
public class Artikal implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = true)
	private Long id;
	
	@Column(name="nazivArtikla", unique = false, nullable = true)
	private String nazivArtikla;
	
	@Column(name="opisArtikla", unique = false, nullable = true)
	private String opisArtikla;
	
	@Column(name="oznakaArtikla", unique = false, nullable = true)
	private Double oznakaArtikla;
	
	@Column(name="path", unique = false, nullable = true)
	private String path;

	@OneToMany(cascade= {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "artikal")
	private Set<Stavka> stavke = new HashSet<Stavka>();
		
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="prodaja_artikla",
				joinColumns = {@JoinColumn(name = "id")},
				inverseJoinColumns = {@JoinColumn(name="prodajaId")}
			)
	private Set<Prodaja> prodaja = new HashSet<Prodaja>();
	
	@Column(name="deleted", unique = false, nullable = false)
	private Boolean deleted;
	
	@ManyToOne
	@JoinColumn(name="korisnik_id", referencedColumnName="korisnikId", nullable=false)
	private Prodavac prodavac;
	
	public Artikal(){
		
	}

	public Artikal(Long id, String nazivArtikla, String opisArtikla, Double oznakaArtikla, String path,
			Set<Stavka> stavke, Set<Prodaja> prodaje) {
		super();
		this.id = id;
		this.nazivArtikla = nazivArtikla;
		this.opisArtikla = opisArtikla;
		this.oznakaArtikla = oznakaArtikla;
		this.path = path;
		this.stavke = stavke;
		this.prodaja = prodaje;
	}

	public Artikal(Long id, String nazivArtikla, String opisArtikla, Double oznakaArtikla, String path) {
		super();
		this.id = id;
		this.nazivArtikla = nazivArtikla;
		this.opisArtikla = opisArtikla;
		this.oznakaArtikla = oznakaArtikla;
		this.path = path;
	}

	public Artikal(Long id, String nazivArtikla, String opisArtikla, Double oznakaArtikla, String path,
			Set<Stavka> stavke, Set<Prodaja> prodaja, Boolean deleted, Prodavac prodavac) {
		super();
		this.id = id;
		this.nazivArtikla = nazivArtikla;
		this.opisArtikla = opisArtikla;
		this.oznakaArtikla = oznakaArtikla;
		this.path = path;
		this.stavke = stavke;
		this.prodaja = prodaja;
		this.deleted = deleted;
		this.prodavac = prodavac;
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

	public Set<Stavka> getStavke() {
		return stavke;
	}

	public void setStavke(Set<Stavka> stavke) {
		this.stavke = stavke;
	}

	public Set<Prodaja> getProdaja() {
		return prodaja;
	}

	public void setProdaja(Set<Prodaja> prodaja) {
		this.prodaja = prodaja;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public Prodavac getProdavac() {
		return prodavac;
	}

	public void setProdavac(Prodavac prodavac) {
		this.prodavac = prodavac;
	}


	
	
}
