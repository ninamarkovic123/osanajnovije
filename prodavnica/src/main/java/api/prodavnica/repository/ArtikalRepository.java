package api.prodavnica.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import api.prodavnica.model.Artikal;

@Repository
public interface ArtikalRepository extends JpaRepository<Artikal, Long>{

	List<Artikal> findAllByDeleted(Boolean deleted);
}
