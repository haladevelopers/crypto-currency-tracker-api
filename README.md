# Enterprise Multi-Currency Exchange Rate REST API Microservice

A production-ready **Spring Boot REST API** microservice engineered to process dynamic multi-currency conversions and maintain a transactional ledger state utilizing optimized in-memory array collections. This project is built utilizing structural object-oriented patterns and is fully optimized for containerization or remote microservice distribution architectures.

## Key Architectural Features
- **RESTful Endpoints:** Fully mapped HTTP GET routers returning auto-serialized JSON data payloads.
- **State Preservation Tier:** Built-in automated transaction collection framework that simulates database rows completely offline.
- **Automated Lifecycle Compilation:** Powered by Apache Maven for dynamic dependency, indexing, and runtime version management.

## Tech Stack & Prerequisites
- **Language Platform:** Java 17 / Java 27 (Oracle OpenJDK)
- **Framework Suite:** Spring Boot 3.2.4 (Spring Web Core Engine)
- **Dependency Manager:** Apache Maven (Project Object Model Engine)
- **Development Workspace:** IntelliJ IDEA

## API Endpoints & Usage Guide

### 1. Execute Live Currency Conversion
- **URL Endpoint Path:** `http://localhost:8080/api/convert`
- **Method Structure:** `GET`
- **URL Parameter Key:** `usd` (Type: `double`, Default: `1`)

#### Sample Target Request URL
```text
http://localhost:8080/api/convert?usd=10.00
```

#### Expected Automated JSON Output Response
```json
{
  "id": 4,
  "baseCurrency": "USD",
  "originalAmountUsd": 10.0,
  "convertedEur": 9.1,
  "convertedPkr": 2785.0,
  "convertedInr": 834.0,
  "timestamp": "2026-09-18T14:22:21.192994800"
}
```

### 2. Retrieve Transaction Audit Log History
- **URL Endpoint Path:** `http://localhost:8080/api/history`
- **Method Structure:** `GET`

---
## Author Portfolio
- **Developer Name:** [Sultan Mehmood]
- **Specialization:** Java Backend Architect & Spring Boot REST API Developer
