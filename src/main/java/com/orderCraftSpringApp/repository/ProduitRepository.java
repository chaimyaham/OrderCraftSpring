package com.orderCraftSpringApp.repository;



import com.orderCraftSpringApp.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
