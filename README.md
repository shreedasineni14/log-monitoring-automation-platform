# Log Monitoring & Incident Detection Platform

A Spring Boot–based backend system that ingests application logs, classifies them by severity, and automatically detects incidents for critical errors.  
Inspired by enterprise monitoring tools like Splunk and Dynatrace.

## 🚀 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- REST APIs
- H2 Database
- Lombok
- Maven
- Git & GitHub

## ✨ Key Features
- Centralized log ingestion via REST APIs
- Log severity classification (INFO / WARN / ERROR)
- Automated incident detection for ERROR-level logs
- Incident persistence with timestamp and severity
- REST APIs to view logs and incidents
- Global exception handling
- Clean layered architecture

## 📡 API Endpoints

### Logs
| Method | Endpoint | Description |
|------|---------|-------------|
| POST | /logs | Ingest application log |
| GET | /logs | Fetch all logs |
| GET | /logs/level/{level} | Fetch logs by severity |

### Incidents
| Method | Endpoint | Description |
|------|---------|-------------|
| GET | /incidents | Fetch all detected incidents |

## Docker Support

This application is containerized using Docker to ensure consistent and portable deployment.

### Build Docker Image
```bash
docker build -t log-monitoring-app .

### Run Docker Container
docker run -p 8080:8080 log-monitoring-app

## Access Application
Swagger UI: http://localhost:8080/swagger-ui/index.html

## How to Run
1.Clone the repository
2.Import as Existing Maven Project in Eclipse
3.Run the Spring Boot application
4.Test APIs via Talend / Postman

## Learning Outcomes
1.Designed centralized log ingestion systems
2.Implemented automated incident detection logic
3.Applied production-style monitoring concepts
4.Improved backend reliability using exception handling

## Author
Dasineni Vidyashree
