package api.prodavnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import api.prodavnica.model.Prodaja;

@Repository
public interface ProdajaRepository extends JpaRepository<Prodaja, Long> {

}
