package api.prodavnica.model;

import javax.persistence.Entity;

@Entity
public class Admin extends Korisnik {

	private static final long serialVersionUID = 1L;

public Admin() {
		
	}

	public Admin(Long id, String ime, String prezime, String korisnickoime, String lozinka, TipKorisnika tipKorisnika) {
		super(id, ime, prezime, korisnickoime, lozinka, tipKorisnika);
	}
}
