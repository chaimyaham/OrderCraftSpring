package com.orderCraftSpringApp.controller;

import com.orderCraftSpringApp.model.Client;
import com.orderCraftSpringApp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/listeDesClients")
    public String listClients(Model model) {
        List<Client> clients = clientService.getAllClients();
        model.addAttribute("clients", clients);
        return "listeDesClients";
    }

    @GetMapping("/supprimerClient/{id}")
    public String supprimerClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return "redirect:/listeDesClients";
    }

    @GetMapping("/modifierClient/{id}")
    public String modifierClientForm(@PathVariable Long id, Model model) {
        Client client = clientService.getClientById(id).orElse(null);
        model.addAttribute("client", client);
        return "modifierClient";
    }

    @PostMapping("/modifierClient")
    public String modifierClient(@ModelAttribute Client client) {
        clientService.saveClient(client);
        return "redirect:/listeDesClients";
    }


    @GetMapping("/ajouterClient")
    public String ajouterClientForm(Model model) {
        model.addAttribute("client", new Client());
        return "ajouterClient";
    }

    @PostMapping("/ajouterClient")
    public String ajouterClient(@ModelAttribute Client client) {
        clientService.saveClient(client);
        return "redirect:/listeDesClients";
    }
}
