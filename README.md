# 14. Payment service

**Category:** Spring Boot microservices  |  **Status:** Scaffold - implement the TODOs

Authorize then capture with provider idempotency keys.

## Sequence
```mermaid
sequenceDiagram
    participant Order
    participant Payment
    participant Provider
    Order->>Payment: POST /payments/authorize
    Payment->>Provider: POST /v1/charges capture false
    Provider->>Payment: authorized
    Payment->>Order: 201 AUTHORIZED
```

## Run
```bash
docker compose up -d
mvn spring-boot:run
```

## Part of
[system-design-concepts-master](../../README.md) - see the master repo for the full concept map.
