package api.prodavnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import api.prodavnica.model.Prodavac;

@Repository
public interface ProdavacRepository extends JpaRepository<Prodavac, Long> {

}
