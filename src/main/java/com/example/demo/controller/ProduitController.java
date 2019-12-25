package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.*;
import com.example.demo.service.IProduitServiceImp;

@RestController
@RequestMapping("/api/produit")
@CrossOrigin
public class ProduitController {

	@Autowired
	private IProduitServiceImp produitServiceImp;
	
	@GetMapping
	public List<Produit> getProduits() {
		return produitServiceImp.getProduits();
	}
	
	@PostMapping
	public void addProduit(@RequestBody Produit p) {
		produitServiceImp.addProduit(p);
	}
	
	@DeleteMapping("/{ref}")
	public void deleteProduit(@PathVariable String ref) {
		produitServiceImp.deleteProduit(ref);
	}
	
	@PutMapping
	public void updateProduit(@RequestBody Produit p) {
		produitServiceImp.updateProduit(p);
	}
	
}
