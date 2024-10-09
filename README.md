# Getting Started
# DIGITAL BANKING - API de Gestion des Clients et Comptes Bancaires

## Description
Cette application est une API REST permettant de gérer les clients et leurs comptes bancaires, sécurisée par **Spring Security** utilisant **JWT (JSON Web Token)**. Les utilisateurs peuvent se connecter en utilisant des identifiants prédéfinis pour générer un token JWT qui permet d'accéder aux différents endpoints de l'API. L'application propose également une documentation interactive via **Swagger UI**.

## Fonctionnalités
- **Authentification JWT** avec des identifiants prédéfinis.
- Gestion des clients (création, mise à jour, consultation et suppression).
- Gestion des comptes bancaires et des opérations associées.
- Documentation Swagger UI pour interagir avec l'API.
- 
## Endpoints

### Authentification
- `POST /auth/login` - Connexion des utilisateurs avec génération d'un token JWT.
- `GET /auth/profile` - Récupérer les informations du profil utilisateur (JWT requis).

### Gestion des Clients
- `POST /customers` - Créer un nouveau client (JWT requis).
- `PUT /customers/{customerId}` - Mettre à jour un client existant (JWT requis).
- `GET /customers` - Récupérer la liste de tous les clients (JWT requis).
- `GET /customers/{id}` - Récupérer un client spécifique par son ID (JWT requis).
- `DELETE /customers/{id}` - Supprimer un client (JWT requis).

### Gestion des Comptes Bancaires
- `GET /accounts` - Récupérer la liste de tous les comptes (JWT requis).
- `GET /accounts/{accountId}` - Récupérer les détails d'un compte spécifique (JWT requis).
- `GET /accounts/{accountId}/operations` - Récupérer les opérations pour un compte spécifique (JWT requis).
- `GET /accounts/{accountId}/pageOperations` - Récupérer les opérations paginées pour un compte spécifique (JWT requis).

## Sécurité
L'application utilise **JWT** pour sécuriser les endpoints. Après une connexion réussie, un token JWT est généré et doit être envoyé dans chaque requête authentifiée via le header `Authorization`.

Exemple de requête avec JWT : 
### Identifiants d'authentification
Pour accéder à l'API, utilise les identifiants suivants :

- **Username**: `admin`
- **Password**: `12345`

### Étapes pour obtenir un token JWT

1. Utilise l'endpoint suivant pour te connecter et obtenir un token JWT :
    - `POST /auth/login`

   **Corps de la requête & Token JWT reçu : **
   ```json
       {
         "username": "admin",
         "password": "12345"
       }

       {
         "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTYxODgzMTI1NSwiZXhwIjoxNjE4ODMzMDU1fQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
       }
Après avoir obtenu le token JWT, ouvre Swagger UI, clique sur Authorize, et colle le token dans le champ.

## Technologies utilisées
- Java
- Spring Boot
- Spring Security
- Hibernate
- OpenAPI
- JWT

## Installation
1. Clone le repository :
   ```bash
   git clone https://github.com/tonutilisateur/digital-banking-api.git
   
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.3.1/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.3.1/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.3.1/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

