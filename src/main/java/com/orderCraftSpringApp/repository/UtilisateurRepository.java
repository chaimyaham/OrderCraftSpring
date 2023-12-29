package com.orderCraftSpringApp.repository;


import com.orderCraftSpringApp.model.Commande;
import com.orderCraftSpringApp.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
