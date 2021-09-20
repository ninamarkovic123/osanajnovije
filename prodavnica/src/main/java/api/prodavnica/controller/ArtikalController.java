package api.prodavnica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.prodavnica.converter.ArtikalKonverter;
import api.prodavnica.service.ArtikalServiceInterface;
import api.prodavnica.dto.ArtikalDTO;
import api.prodavnica.model.Artikal;
@RestController
@RequestMapping(value="delivery/artikli")
public class ArtikalController {
	
	@Autowired
	private ArtikalServiceInterface artikalServiceInterface;
	
	@Autowired
	ArtikalKonverter artikalKonverter;
	
	@GetMapping(value="/all")
	public ResponseEntity<List<ArtikalDTO>> getArtikle(){
		List<Artikal> artikli = artikalServiceInterface.findAllByDeleted(false);
		List<ArtikalDTO> artikalDTO = new ArrayList<ArtikalDTO>();
		for (Artikal a : artikli) {
			artikalDTO.add(artikalKonverter.toDTO(a));
		}
		return new ResponseEntity<List<ArtikalDTO>>(artikalDTO,HttpStatus.OK);
	}
	
	@GetMapping(value="/{artikal_id}")
	public ResponseEntity<ArtikalDTO> getArtikal(@PathVariable("artikal_id") Long artikal_id){
		Artikal artikal = artikalServiceInterface.findOne(artikal_id);
		if(artikal == null) {
			return new ResponseEntity<ArtikalDTO>(HttpStatus.NOT_FOUND);
		}
		ArtikalDTO artikalDTO = artikalKonverter.toDTO(artikal);
		return new ResponseEntity<ArtikalDTO>(artikalDTO, HttpStatus.OK);
	}
	
	@PostMapping(consumes = "application/json", value="/add")
	public ResponseEntity<ArtikalDTO> saveArtikal(@RequestBody ArtikalDTO aDTO){
		Artikal a = artikalKonverter.toArtikal(aDTO);
		a.setDeleted(false);
		Artikal ar = artikalServiceInterface.save(a);
		ArtikalDTO artikalDTO = artikalKonverter.toDTO(ar);
		return new ResponseEntity<ArtikalDTO>(artikalDTO, HttpStatus.CREATED);
	}
	
	@PutMapping(value="/{artikal_id}", consumes = "application/json")
	public ResponseEntity<ArtikalDTO> updateArtikal(@RequestBody ArtikalDTO aDTO,@PathVariable("artikal_id") Long artikal_id){
		Artikal artikal = artikalServiceInterface.findOne(artikal_id);
		if (artikal == null) {
			return new ResponseEntity<ArtikalDTO>(HttpStatus.NOT_FOUND);
		}
		Artikal a = artikalKonverter.toArtikal(aDTO);
		a.setDeleted(false);
		Artikal ar = artikalServiceInterface.save(a);
		ArtikalDTO artikalDTO = artikalKonverter.toDTO(ar);
		return new ResponseEntity<ArtikalDTO>(artikalDTO, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/{artikal_id}")
	public ResponseEntity<Void> deleteArtikal(@PathVariable("artikal_id") Long artikal_id){
		Artikal artikal = artikalServiceInterface.findOne(artikal_id);
		if (artikal!=null) {
			artikal.setDeleted(true);
			artikalServiceInterface.save(artikal);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	
}


