package com.orderCraftSpringApp.model;


import javax.persistence.*;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom_utilisateur", nullable = false, unique = true)
    private String nomUtilisateur;

    @Column(name = "password", nullable = false)
    private String password;

    public Utilisateur() {

    }

    public Utilisateur(String nomUtilisateur, String password) {
        this.nomUtilisateur = nomUtilisateur;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Utilisateur [id=" + id + ", nomUtilisateur=" + nomUtilisateur + ", password=" + password + "]";
    }
}
