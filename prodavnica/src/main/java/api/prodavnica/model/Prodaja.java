package api.prodavnica.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prodaja")
public class Prodaja implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="prodajaId", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "procenat", unique = false, nullable = false)
	private String procenat;
	
	@Column(name = "datumOd", unique = false, nullable = false)
	private Date datumOd;
	
	@Column(name = "datumDo", unique = false, nullable = false)
	private Date datumDo;
	
	@Column(name = "text", unique = false, nullable = false)
	private String text;

	@ManyToMany(mappedBy="prodaja")
	private Set<Artikal> artikli = new HashSet<Artikal>();
	
	@ManyToOne
	@JoinColumn(name="korisnikId", referencedColumnName="korisnikId", nullable=false)
	private Prodavac prodavac;
	
	public Prodaja() {
		
	}

	public Prodaja(Long id, String procenat, Date datumOd, Date datumDo, String text, Set<Artikal> artikli) {
		super();
		this.id = id;
		this.procenat = procenat;
		this.datumOd = datumOd;
		this.datumDo = datumDo;
		this.text = text;
		this.artikli = artikli;
	}

	public Prodaja(Long id, String procenat, Date datumOd, Date datumDo, String text, Set<Artikal> artikli,
			Prodavac prodavac) {
		super();
		this.id = id;
		this.procenat = procenat;
		this.datumOd = datumOd;
		this.datumDo = datumDo;
		this.text = text;
		this.artikli = artikli;
		this.prodavac = prodavac;
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

	public Set<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(Set<Artikal> artikli) {
		this.artikli = artikli;
	}

	public Prodavac getProdavac() {
		return prodavac;
	}

	public void setProdavac(Korisnik korisnik) {
		this.prodavac = (Prodavac) korisnik;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}
