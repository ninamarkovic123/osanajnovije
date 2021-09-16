package api.prodavnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.prodavnica.model.Kupac;

@Repository
public interface KupacRepository extends JpaRepository<Kupac, Long> {

}
