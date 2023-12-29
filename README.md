# Projet de Gestion de Commandes 

Ce projet a été converti de J2EE à Spring MVC avec l'utilisation de JPA Hibernate pour fournir une solution de gestion de commandes. Il offre des fonctionnalités telles que l'ajout de commandes, l'affichage des commandes existantes, la modification et la suppression de commandes, ainsi que la gestion des clients, produits, et statuts de commande.


## Stack Technique
- Langage de Programmation : Java
- Frontend : Thymeleaf pour les vues dynamiques
- Backend : Spring Core (IOC, DI) - Spring MVC - Hibernate - Spring Data JPA
- Gestion de Dépendances : Apache Maven
- Base de Données : MySQL
- Serveur d'Application : Apache Tomcat

## Fonctionnalités

- **Ajout de Commandes :** Permet d'ajouter de nouvelles commandes avec des produits associés.
- **Affichage des Commandes :** Offre une vue détaillée de la liste des commandes avec les produits correspondants.
- **Modification et Suppression :** Permet aux utilisateurs autorisés de mettre à jour ou de supprimer des commandes existantes.
- **Gestion des Clients et Produits :** Permet l'ajout, la modification, et la suppression de clients et de produits.
- **Statuts de Commande :** Intègre un système de statuts de commande, tels que "En Cours", "Terminée", et "Annulée".

## Prérequis

- JDK (Java Development Kit)
- Serveur Apache Tomcat
- Base de Données Relationnelle (MySQL)
- Outil de Gestion de Base de Données (MySQL)
- Maven (pour la gestion des dépendances)

## Configuration

1. Clonez le projet depuis le dépôt Git.
2. Importez le projet dans votre IDE préféré.
3. Configurez la connexion à la base de données dans le fichier de configuration (`src/main/resources/application.properties`).
4. Assurez-vous que le serveur Apache Tomcat est configuré dans votre environnement.

## Structure du Projet

- `src/main/java` : Contient les classes Java, y compris les servlets et les entités.
- `src/main/webapp` : Contient les fichiers html et les ressources Web.
- `src/main/resources` : Contient les fichiers de configuration.

## Contributeurs

- Chaimaa MAHY

## Problèmes Connus

- **Gestion des Erreurs Utilisateur :** Les messages d'erreur pour les saisies utilisateur incorrectes ne sont pas toujours clairs. Une amélioration de la gestion des erreurs pourrait améliorer l'expérience utilisateur.

## Améliorations Futures

- **Pagination des Résultats :** Ajouter une fonction de pagination pour la liste des commandes afin de faciliter la navigation, surtout lorsque le nombre de commandes devient important.
- **Gestion des Stocks :** Intégrer un système de gestion des stocks pour mettre à jour automatiquement la quantité en stock des produits lors de la création ou de la modification de commandes.
