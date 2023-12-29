package com.orderCraftSpringApp.model;



import javax.persistence.*;
import java.util.Date;
import java.util.List;



@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commande_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_de_commande")
    private Date date_de_commande;


    @Enumerated(EnumType.STRING)
    @Column(name = "statut")
    private StatutCommande statut;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CommandeProduit> produitsQuantites;

    public Commande() {
    }

    public Long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public Long getClient_id() {
        return (client != null) ? client.getClientId() : null;
    }
    public Date getDate_de_commande() {
        return date_de_commande;
    }

    public StatutCommande getStatut() {
        return statut;
    }

    public void setStatut(StatutCommande statut) {
        this.statut = statut;
    }

    public List<CommandeProduit> getProduitsQuantites() {
        return produitsQuantites;
    }
}
