@searchProduct
Feature: Rechercher un produit avec son nom 
  	ETQ utilisateur je souhaite chercher un produit en utilisant le nom

  @productName
  Scenario: Je souhaite chercher un produit avec son nom
    Given Je visite l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    And Je saisis le login "admin"
    And Je clique sur le bouton Login
    Then Je me redirige vers la page home
    When Je clique sur Catalog
    And Je clique sur Products
    And Je saisis le nom du produit "parfum"
    And Je clique sur le bouton search