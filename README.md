# 🏥 Patient Management System 

A comprehensive system for managing medical clinics and centers. This project aims to automate core operations, including patient registration, appointment scheduling, and managing Electronic Medical Records (EMR).

## 🚀 Microservices Architecture

This system is built using a microservices architecture, with each service handling a distinct business domain:

# 👩‍⚕️ Patient Service

This service is the source of truth for all patient-related information within the Patient Management System. It is responsible for creating, reading, updating, and deleting patient profiles.

## ⚙️ Configuration

This service runs on the following default configuration:

* **Port:** `8080`
* **Database:** H2 In-Memory
* **H2 Console:** `http://localhost:8080/h2-console`

## Endpoints

### Patient API

#### `GET /patients`

Returns a list of all patients currently registered in the system.

* **Method:** `GET`
* **Path:** `/patients`
* **Response:** `200 OK`

**Example JSON Response Body:**

```json
[
  {
    "id": "123e4567-e89b-12d3-a456-426614174000",
    "name": "John Doe",
    "email": "john.doe@example.com",
    "address": "123 Main St, Springfield",
    "dateOfBirth": "1985-06-15"
  },
  {
    "id": "123e4567-e89b-12d3-a456-426614174001",
    "name": "Jane Smith",
    "email": "jane.smith@example.com",
    "address": "456 Elm St, Shelbyville",
    "dateOfBirth": "1990-09-23"
  }
]
