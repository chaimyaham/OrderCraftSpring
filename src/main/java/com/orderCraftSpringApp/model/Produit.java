package com.orderCraftSpringApp.model;

import javax.persistence.*;

import java.math.BigDecimal;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;

    @Column(name = "label")
    private String label;

    @Column(name = "quantite_in_stock")
    private int quantite_in_stock;

    @Column(name = "prix_unitaire")
    private BigDecimal prix_unitaire;


    public long getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getQuantite_in_stock() {
        return quantite_in_stock;
    }

    public void setQuantite_in_stock(int quantite_in_stock) {
        this.quantite_in_stock = quantite_in_stock;
    }

    public BigDecimal getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(BigDecimal prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    @Override
    public String toString() {
        return "Produit [productId=" + productId + ", label=" + label + ", quantite_in_stock=" + quantite_in_stock
                + ", prix_unitaire=" + prix_unitaire + "]";
    }

}
