package api.prodavnica.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="porudzbine")
public class Porudzbina implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="porudzbinaId", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "sat", unique = false, nullable = false)
	private Date sat;
	
	@Column(name = "dostavljeno", unique = false, nullable = false)
	private Boolean dostavljeno;
	
	@Column(name = "oznakaPorudzbine", unique = false, nullable = false)
	private Integer oznakaPorudzbine;
	
	@Column(name = "komentar", unique = false, nullable = false)
	private String komentar;
	
	@Column(name = "anonimanKomentar" , unique = false, nullable = false)
	private Boolean anonimanKomentar;
	
	@Column(name = "arhiviranKomentar",unique = false, nullable = false)
	private Boolean arhivanKomentar;
	
	@OneToMany(cascade= {CascadeType.ALL}, fetch = FetchType.LAZY, mappedBy = "porudzbina")
	private Set<Stavka> stavke = new HashSet<Stavka>();
	
	@ManyToOne
	@JoinColumn(name="korisnikId", referencedColumnName="korisnikId", nullable=false)
	private Kupac kupac;
	
	public Porudzbina() {
		
	}

	public Porudzbina(Long id, Date sat, Boolean dostavljeno, Integer oznakaPorudzbine, String komentar,
			Boolean anonimanKomentar, Boolean arhivanKomentar, Set<Stavka> stavke) {
		super();
		this.id = id;
		this.sat = sat;
		this.dostavljeno = dostavljeno;
		this.oznakaPorudzbine = oznakaPorudzbine;
		this.komentar = komentar;
		this.anonimanKomentar = anonimanKomentar;
		this.arhivanKomentar = arhivanKomentar;
		this.stavke = stavke;
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

	public Integer getOznakaPorudzbine() {
		return oznakaPorudzbine;
	}

	public void setOznakaPorudzbine(Integer oznakaPorudzbine) {
		this.oznakaPorudzbine = oznakaPorudzbine;
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

	public Boolean getArhivanKomentar() {
		return arhivanKomentar;
	}

	public void setArhivanKomentar(Boolean arhivanKomentar) {
		this.arhivanKomentar = arhivanKomentar;
	}

	public Set<Stavka> getStavke() {
		return stavke;
	}

	public void setStavke(Set<Stavka> stavke) {
		this.stavke = stavke;
	}

	public Kupac getKupac() {
		return kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
