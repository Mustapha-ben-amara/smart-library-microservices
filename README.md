
# Smart Library - Microservices Project

##📌 Description
Smart Library est un projet vitrine pour démontrer vos compétences en développement Java Spring Boot, microservices et communication inter-services via Feign.  
Le projet est composé de deux microservices principaux :
- **Book Service** : Gère les informations sur les livres.
- **Client Service** : Gère les clients et récupère la liste des livres via Feign depuis le Book Service.

Le projet inclut :
- Découpage en microservices
- Communication inter-services avec Feign
- Initialisation des données avec `CommandLineRunner`
- Tests via Postman ou curl
- Architecture prête pour Docker et CI/CD

---

##📌 Structure du projet

smart-library-microservices/
├─ book-service/ # Microservice Livre
│ ├─ src/main/java/com/smartlibrary/book/
│ │ ├─ Book.java
│ │ ├─ BookRepository.java
│ │ └─ DataInitializer.java
│ └─ pom.xml
├─ client-service/ # Microservice Client
│ ├─ src/main/java/com/smartlibrary/client/
│ │ ├─ Client.java
│ │ ├─ ClientRepository.java
│ │ ├─ ClientController.java
│ │ └─ BookClient.java
│ └─ pom.xml
└─ README.md
---

## 📌Prérequis
- Java 17
- Maven
- IDE IntelliJ ou Eclipse
- Postman ou curl

---

##📌 Lancer le projet

1. Cloner le repository :  
```bash
git clone https://github.com/Mustapha-ben-amara/smart-library-microservices.git
cd smart-library-microservices

2-Lancer Book Service :

cd book-service
mvn spring-boot:run


Port par défaut : 8082

Vérifier santé : http://localhost:8082/actuator/health
 → {"status":"UP"}

Lancer Client Service :

cd ../client-service
mvn spring-boot:run


Port par défaut : 8081

Vérifier santé : http://localhost:8081/actuator/health
 → {"status":"UP"}

## 📌Tester avec Postman

Récupérer la liste des livres pour un client :

GET http://localhost:8081/clients/client/books


Exemple de réponse :

[
  {"isbn":"ISBN-001","title":"Clean Code"},
  {"isbn":"ISBN-002","title":"Spring in Action"},
  {"isbn":"ISBN-003","title":"Effective Java"}
]

## 📌Fonctionnalités

Microservices séparés pour Book et Client

Communication inter-services via Feign

Initialisation automatique de données avec CommandLineRunner

Architecture prête pour CI/CD et Docker

Facilement extensible pour ajouter d’autres services (ex: Commande, Stock)
