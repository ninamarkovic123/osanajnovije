package api.prodavnica.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stavke")
public class Stavka implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stavka_id", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "kolicina", unique = false, nullable = false)
	private Integer kolicina;
	
	@ManyToOne
	@JoinColumn(name="porudzbinaId", referencedColumnName="porudzbinaId", nullable=false)
	private Porudzbina porudzbina;
	
	@ManyToOne
	@JoinColumn(name="artikalId", referencedColumnName="id", nullable=false)
	private Artikal artikal;
	
	public Stavka() {
		
	}

	public Stavka(Long id, Integer kolicina, Porudzbina porudzbina, Artikal artikal) {
		super();
		this.id = id;
		this.kolicina = kolicina;
		this.porudzbina = porudzbina;
		this.artikal = artikal;
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

	public Porudzbina getPorudzbina() {
		return porudzbina;
	}

	public void setPorudzbina(Porudzbina porudzbina) {
		this.porudzbina = porudzbina;
	}

	public Artikal getArtikal() {
		return artikal;
	}

	public void setArtikal(Artikal artikal) {
		this.artikal = artikal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
