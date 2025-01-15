# **🛠️ Projet Microservices**

## Architecture des Microservices

Le microservice est une architecture moderne et populaire utilisée pour concevoir des applications logicielles ces dernières années.

## Principes des Microservices

Une application basée sur les microservices est composée de plusieurs services distincts, où chaque service est :  
- **Déployable indépendamment**  
- **Évolutif indépendamment**  

Ces deux principes sont les exigences fondamentales d'une architecture microservices.

# 📚 Aperçu du Projet

## Structure de l'Application
Dans cette application, nous avons deux services principaux :  
- **product-service**  
- **offer-service**  

Ces deux services sont déployables et évolutifs de manière indépendante. Ils utilisent deux bases de données différentes, bien que cela ne soit pas une obligation dans une architecture microservices. Les deux services pourraient également partager une même base de données si nécessaire.

## Services Complémentaires

Pour exposer ces services et mettre en place une véritable architecture de microservices, deux autres services ont été intégrés :  
- **service-registry** : utilisé pour la découverte des services.  
- **api-gateway** : utilisé pour le routage dynamique des services ainsi que pour l'équilibrage de charge.

## Architecture de l’Application

Voici une représentation de l'architecture de l’application:  

![Architecture de l'Application](readme-images/architecture.png)





