# 🚀 Spring Boot Microservices Project

This repository contains a complete microservices-based system built using **Spring Boot**, implementing services such as:

- `Company Service`
- `Job Service`
- `Review Service`
- `API Gateway`
- `Config Server`
- `Service Registry (Eureka)`

The system is integrated with **Zipkin** for distributed tracing and **Prometheus + Grafana** for monitoring and visualization.

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Cloud (Eureka, Config, Gateway)**
- **Zipkin** – Distributed Tracing
- **Prometheus** – Metrics Collection
- **Grafana** – Visualization
- **Docker & Docker Compose** – Containerization
- **Lombok**, **Spring Data JPA**, **MySQL**

---

## 🧱 Microservices Overview

| Service         | Description                                   | Port  |
|----------------|-----------------------------------------------|--------|
| CompanyService | Manages company information                   | 8081   |
| JobService     | Handles job listings and details              | 8082   |
| ReviewService  | Stores and fetches reviews for companies      | 8083   |
| API Gateway    | Routes and filters requests                   | 8084   |
| Config Server  | Centralized configuration for all services    | 8080   |
| Eureka Server  | Service registry and discovery                | 8761   |
| Zipkin         | Distributed tracing                           | 9411   |
| Prometheus     | Metrics scraping                              | 9090   |
| Grafana        | Metrics visualization                         | 3000   |

---

## 🐳 Docker Setup

1. **Build All Services:**  
   From the root directory:
   ```bash
   ./mvnw clean install
   ```
   
2. **Start the entire system:**
   ```bash
   docker-compose up --build
   ```
