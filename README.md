# NFT Marketplace Spring Boot Project - Server Side

This project handles the server side of our NFT Marketplace, managing NFT metadata storage in MongoDB and performing CRUD operations. We utilize a **microservices** approach to achieve this.

Links to related repositories:

[Solidity Contract](https://github.com/najlae01/monsters-collection)

[Client Side](https://github.com/najlae01/nftmarketplace-client)

## Spring Boot Project

### Microservices Overview

A **Microservice Application** structures an app as a collection of small, loosely-coupled services. Each service runs in its own process and communicates via APIs. This architecture allows for greater scalability, flexibility, and ease of deployment compared to a monolithic approach.

### 1. Setting up Microservices

- **Service Registry**:

  - Created a Spring Boot project `ServiceRegistry-Microservice`.
  - Added dependencies: Eureka Server, Spring Cloud Netflix, Spring Boot Actuator.
  - Enabled Eureka server using `@EnableEurekaServer`.
  - Configured Eureka server properties in `application.properties`.

- **NFT Microservice**:

  - Created a Spring Boot project `nfts-microservices`.
  - Added dependencies: Eureka Client, Spring Boot Actuator.
  - Enabled Eureka client using `@EnableDiscoveryClient`.
  - Configured Eureka client properties in `application.properties`.
  - Created controllers, services, and repositories.
  - Registered the microservice with Eureka server (Port 8081).

- **API Gateway**:
  - Created a Spring Boot project for the API Gateway.
  - Added dependencies: Eureka Client, Spring Boot Actuator.
  - Configured Eureka client properties in `application.properties`.
  - Created necessary routes.
  - Registered the API Gateway with Eureka server (Port 9191).

### 2. Creating REST APIs

- **Main API Endpoint: `/api/nfts/`**:

  - **POST**: Store NFTs in MongoDB.
  - **PUT**: Update NFTs in MongoDB.
  - **GET**: Retrieve all NFTs from MongoDB.
  - **DELETE**: Delete an NFT by `tokenId`.
  - **GET**: Retrieve an NFT by `tokenId`.

- **Upload Endpoint: `/api/nfts/upload`**:
  - **POST**: Upload NFT images to the database.
