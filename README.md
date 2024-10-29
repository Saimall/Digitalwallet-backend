# Digital Wallet Application

A secure and scalable digital wallet application built using Spring Boot, Microservices, PostgreSQL, JWT authentication, Cloudinary, JPA, and RESTful APIs. This project leverages various technologies to provide users with a seamless experience for managing their digital transactions.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Architecture](#architecture)
- [Getting Started](#getting-started)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)
- [License](#license)

## Features

- User authentication and authorization using JWT tokens
- Secure transactions and balance management
- Image upload and management using Cloudinary
- Service discovery with Eureka
- Centralized configuration management with Config Server
- API Gateway for routing and managing requests

## Technologies Used

- **Spring Boot**: Framework for building the application
- **Microservices**: Architecture style for developing the app
- **PostgreSQL**: Database for storing user and transaction data
- **JWT**: Authentication mechanism for securing APIs
- **Cloudinary**: Service for handling image uploads
- **JPA**: Java Persistence API for database interactions
- **Eureka**: Service discovery for microservices
- **Config Server**: Centralized configuration management
- **API Gateway**: Routing requests to various microservices

## Architecture
[Client] --> [API Gateway] --> [Eureka Server] --> [Microservices]


## Getting Started

### Prerequisites

- Java 11 or higher
- PostgreSQL
- Maven
- Docker (optional for containerization)

### Installation

1. Clone the repository:
   git clone https://github.com/Saimall/Digitalwallet-backend.git
   cd digital-wallet

2. Set up your PostgreSQL database and update the application properties with your database credentials.
    mvn clean install

3. Run the application:
   mvn spring-boot:run
You can access all services  through APIGATEWAT port 8060.


### Contributing 
Contributions are welcome! Please fork the repository and create a pull request for any improvements or bug fixes.
