# Log Monitoring & Incident Detection Platform

A Spring Boot–based backend system that ingests application logs, classifies them by severity, and automatically detects incidents for critical errors.  
Inspired by enterprise monitoring tools like Splunk and Dynatrace.

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- REST APIs
- H2 Database
- Lombok
- Maven
- Git & GitHub

##  Key Features
- Centralized log ingestion via REST APIs
- Log severity classification (INFO / WARN / ERROR)
- Automated incident detection for ERROR-level logs
- Incident persistence with timestamp and severity
- REST APIs to view logs and incidents
- Global exception handling
- Clean layered architecture

##  API Endpoints

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

##  How to Run
1. Clone the repository
2. Import as **Existing Maven Project** in Eclipse
3. Run the Spring Boot application
4. Test APIs via Talend / Postman

##  Learning Outcomes
- Designed centralized log ingestion systems
- Implemented automated incident detection logic
- Applied production-style monitoring concepts
- Improved backend reliability using exception handling

##  Author
Dasineni Vidyashree
