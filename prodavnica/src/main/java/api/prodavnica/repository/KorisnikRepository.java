package api.prodavnica.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.prodavnica.model.Korisnik;

@Repository
public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {
	Korisnik findByKorisnickoimeAndLozinka(String korisnickoime, String lozinka);

}
