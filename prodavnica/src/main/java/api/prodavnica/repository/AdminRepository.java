package api.prodavnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api.prodavnica.model.Admin;


@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
