package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.Produit;
import com.orderCraftSpringApp.model.User;
import com.orderCraftSpringApp.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @GetMapping("/listeDesProduits")
    public String listClient(Model model){
        List<Produit> produits = produitService.getAllProduits();
        produits.forEach(System.out::println);
        model.addAttribute("produits", produits);
        return "listeDesProduits";

    }
    @GetMapping("/ajouterProduit")
    public String ajouterProduitForm(Model model) {
        model.addAttribute("produit", new Produit());
        return "ajouterProduit";
    }
    @PostMapping("/ajouterProduit")
    public String ajouterProduit(@ModelAttribute Produit produit) {
        produitService.saveProduit(produit);
        return "redirect:/listeDesProduits";
    }
    @GetMapping("/supprimerProduit/{id}")
    public String supprimerProduit(@PathVariable Long id) {
        produitService.deleteProduit(id);
        return "redirect:/listeDesProduits";
    }

    @GetMapping("/modifierProduit/{id}")
    public String modifierProduitForm(@PathVariable Long id, Model model) {
        Produit produit = produitService.getProduitById(id).orElse(null);
        model.addAttribute("produit", produit);
        return "modifierProduit";
    }

    @PostMapping("/modifierProduit")
    public String modifierProduit(@ModelAttribute Produit produit) {
        produitService.saveProduit(produit);
        return "redirect:/listeDesProduits";
    }

}
