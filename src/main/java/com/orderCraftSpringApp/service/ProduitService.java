package com.orderCraftSpringApp.service;

import com.orderCraftSpringApp.model.Produit;
import com.orderCraftSpringApp.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {

    private final ProduitRepository produitRepository;

    @Autowired
    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Optional<Produit> getProduitById(Long produitId) {
        return produitRepository.findById(produitId);
    }

    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public void deleteProduit(Long produitId) {
        produitRepository.deleteById(produitId);
    }


}
