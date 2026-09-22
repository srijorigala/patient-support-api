# Patient Support API

A Spring Boot REST API for managing patient information as part of a Patient Financial Assistance and Support Platform.

This project is being developed to demonstrate backend development using Java, Spring Boot, Spring Data JPA, PostgreSQL, and RESTful API design.

## Technologies

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Gradle
- REST API
- Postman
- Git & GitHub

## Project Architecture

The application follows a layered architecture:

```text
Client / Postman
       |
       v
Controller
       |
       v
Service
       |
       v
Repository
       |
       v
PostgreSQL Database
```

### Controller Layer

Handles HTTP requests and communicates with the service layer.

### Service Layer

Contains the business logic of the application.

### Repository Layer

Uses Spring Data JPA to communicate with the PostgreSQL database.

### Model Layer

Contains the JPA entities representing application data.

## Patient Model

The Patient entity currently contains:

- ID
- First Name
- Last Name
- Email
- Insurance Type
- Annual Income

## API Endpoints

### Create Patient

```http
POST /patients
```

Example request:

```json
{
  "firstName": "John",
  "lastName": "Smith",
  "email": "john@example.com",
  "insuranceType": "Medicare",
  "annualIncome": 50000
}
```

### Get All Patients

```http
GET /patients
```

### Get Patient by ID

```http
GET /patients/{id}
```

Example:

```http
GET /patients/1
```

### Search Patients by Insurance

```http
GET /patients/search?insurance=Medicare
```

### Update Patient

```http
PUT /patients/{id}
```

### Delete Patient

```http
DELETE /patients/{id}
```

## Database

The application uses PostgreSQL as its relational database.

Spring Data JPA and Hibernate are used for database operations and object-relational mapping.

## Current Features

- Create patients
- Retrieve all patients
- Retrieve patient by ID
- Update patient information
- Delete patients
- Search patients by insurance type
- PostgreSQL database integration
- Spring Data JPA repository
- Layered Controller-Service-Repository architecture
- Custom `PatientNotFoundException`

## Planned Features

The project will continue to include:

- Global exception handling
- Proper HTTP status responses
- DTOs
- Request validation
- Patient eligibility checks
- Financial assistance workflows
- Spring Security
- JWT authentication
- Role-based authorization
- Logging and monitoring
- Unit and integration testing
- Docker
- CI/CD

## Running the Application

Clone the repository:

```bash
git clone https://github.com/srijorigala/patient-support-api.git
```

Navigate to the project:

```bash
cd patient-support-api
```

Run the application:

```bash
./gradlew bootRun
```

The application runs locally on:

```text
http://localhost:8080
```

## Testing

API endpoints can be tested using Postman.

Example:

```http
GET http://localhost:8080/patients
```

## Project Status

This project is currently under active development as additional Spring Boot backend concepts and production-ready features are implemented.
