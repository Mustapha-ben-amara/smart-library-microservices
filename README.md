
# Smart Library – Microservices Architecture (Spring Boot)
## 📌 Description

Smart Library est un projet vitrine backend démontrant une architecture microservices complète basée sur Spring Boot.

## Le projet met en œuvre :

- Architecture microservices

- API Gateway centralisée

- Service Discovery avec Netflix Eureka

- Sécurité centralisée avec JWT

- Gestion des rôles (USER / ADMIN)

- Communication inter-services via OpenFeign

- Pagination REST professionnelle (Pageable)

- Base H2 embarquée

- Initialisation automatique des données

- Architecture prête pour Docker et CI/CD

## 🏗️ Architecture

## Le système est composé de :

1️⃣ API Gateway

 Centralisation de la sécurité

 Validation des JWT

 Filtrage des requêtes

 Routage vers les microservices

2️⃣ Auth Service

 Authentification des utilisateurs

 Génération de JWT

 Gestion des rôles (USER / ADMIN)

3️⃣ Book Service

 Gestion des livres

 Pagination dynamique

 Protection par rôles

4️⃣ Client Service

 Gestion des clients

 Appel distant vers Book Service via Feign

5️⃣ Service Discovery

 Enregistrement automatique des services via Eureka

## 🔐 Sécurité

### - Le projet implémente :

 Authentification JWT

 Validation du token au niveau API Gateway

 Autorisation basée sur les rôles

 Protection des routes sensibles (ADMIN uniquement)

### - Exemple :

GET /books?page=0&size=5

Authorization: Bearer <JWT>

## 📦 Pagination REST

 Le Book Service implémente une pagination professionnelle via Pageable.

### - Exemple :
GET /books?page=1&size=5&sort=title,asc

- Fonctionnement technique :

 Utilisation de LIMIT et OFFSET au niveau SQL
 Réponse incluant métadonnées (totalElements, totalPages, etc.)
 Configuration d’une taille maximale sécurisée

## ⚙️ Prérequis
- Java 17
- Maven
- IDE IntelliJ ou Eclipse
- Postman ou curl

## 🚀 Lancer le projet
1️⃣ Cloner le repository
git clone https://github.com/Mustapha-ben-amara/smart-library-microservices.git
cd smart-library-microservices
2️⃣ Lancer Eureka Server

cd discovery-service
mvn spring-boot:run

Port par défaut : 8761
Console : http://localhost:8761

3️⃣ Lancer Book Service

cd book-service
mvn spring-boot:run

Port par défaut : 8082
Health check : http://localhost:8082/actuator/health

4️⃣ Lancer Client Service
cd client-service
mvn spring-boot:run

Port par défaut : 8081

5️⃣ Lancer Auth Service
cd auth-service
mvn spring-boot:run

6️⃣ Lancer API Gateway

cd api-gateway

mvn spring-boot:run

## 🧪 Tests avec Postman

### 🔑 Authentification

POST /auth/login

Body :

{
  "username": "admin",
  "password": "admin"
}

Retour :

{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}

## 📚 Accès aux livres

GET /books?page=0&size=5

Authorization: Bearer <TOKEN>

## 🧠 Compétences démontrées

- Architecture microservices

- Spring Security + JWT

- API Gateway sécurisée

- Communication inter-services

- Pagination optimisée

- Gestion des rôles

- Structuration propre d’un projet distribué

## 🔮 Évolutions possibles

 - Refresh Token

 - Docker Compose

 - Base PostgreSQL

 - Tests unitaires

 - Observabilité (logs centralisés)

## 🎯 Objectif du projet

#### Projet vitrine démontrant un niveau backend confirmé avec :

 - Sécurité maîtrisée

 - Architecture distribuée

 - Code structuré

 - Bonnes pratiques REST