package api.prodavnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.prodavnica.model.Admin;
import api.prodavnica.repository.AdminRepository;

@Service
public class AdminService implements AdminServiceInterface {

	@Autowired
	AdminRepository adminRepository;
	
	@Override
	public Admin findOne(Long korisnikId) {
		return adminRepository.getOne(korisnikId);
	}

	@Override
	public Admin save(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public void remove(Long korisnikId) {
		adminRepository.deleteById(korisnikId);
	}

	@Override
	public List<Admin> findAll() {
		return adminRepository.findAll();
	}

}
