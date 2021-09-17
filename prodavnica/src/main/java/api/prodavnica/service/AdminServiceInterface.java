package api.prodavnica.service;

import java.util.List;

import api.prodavnica.model.Admin;

public interface AdminServiceInterface {
	Admin findOne(Long korisnikId);
	
	Admin save(Admin admin);
	
	void remove(Long korisnikId);
	
	List<Admin> findAll();
}
