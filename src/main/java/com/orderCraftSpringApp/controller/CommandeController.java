package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.Commande;
import com.orderCraftSpringApp.model.User;
import com.orderCraftSpringApp.service.CommandeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class CommandeController {

    private final CommandeService commandeService;





    @Autowired
    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping("/listeCommandes")
    public String listeCommandes(Model model) {

        model.addAttribute("commandes", commandeService.getAllCommandes());

        return "listeCommandes";
    }
}
