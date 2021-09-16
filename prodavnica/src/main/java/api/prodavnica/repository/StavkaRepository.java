package api.prodavnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import api.prodavnica.model.Stavka;

@Repository
public interface StavkaRepository  extends JpaRepository<Stavka, Long> {

}
