# Highway-Ticket-Management-System-Microservice

The Highway Ticket Management System is designed using microservices architecture to efficiently manage highway toll and
ticketing operations. This system decomposes the application into a set of small, independent services, each responsible
for a specific function within the ticket management domain.

## Key Components

### Service Registry

Enables microservices to register themselves and discover other services dynamically.
Implementation: Uses Eureka for service registration and discovery, allowing microservices to communicate without
hardcoded dependencies.

### Configuration Server

Centralizes configuration management for all microservices.
Implementation: Uses Spring Cloud Config to externalize configuration properties, enabling dynamic updates without
redeployment.

### API Gateway

Acts as the single-entry point for all client requests, routing them to the appropriate microservices.
Implementation: Uses Zuul/Spring Cloud Gateway to handle request routing, load balancing, and security. Leverages Eureka
for dynamic service discovery.

### Microservices

Independent services that handle specific business functions within the system.

* Ticket Service: Handles the creation, update, and retrieval of tickets.
* Vehicle Service: Manages vehicle information, including registration, updates, and retrieval of vehicle data.
* User Service: Manages user authentication, authorization, and profiles.
* Payment: Processes toll payments and transactions.

## Prerequisites

✅Java 11+<br/>
✅Spring Boot<br/>
✅Spring Cloud Config<br/>
✅Spring Cloud Netflix (Eureka)<br/>

## Features

* Scalability: Each service can be scaled independently based on traffic and workload.
* Resilience: The system is designed to handle failures gracefully, ensuring that individual service failures do not
  impact the entire application.
* Flexibility: Each microservice can be developed, deployed, and updated independently, allowing for continuous
  integration and delivery.
* Technology Diversity: Different microservices can use different technologies and frameworks best suited for their
  specific tasks.

## Getting Started

1. Clone the Repository:`git clone https://github.com/yourusername/Highway-Ticket-Management-System-Microservice.git`
2. Build and Run Services:Navigate to each service directory and follow the instructions in their respective README.md
   files to build and run them.
3. Start Service Registry:Ensure Eureka Server is up and running.
4. Start Configuration Server:Ensure Spring Cloud Config Server is up and running and has access to the configuration
   repository.
5. Start API Gateway:Ensure the API Gateway is up and running to route client requests to the appropriate microservices.

⭐️If you hava any bugs or issues ,If you want to explain code please contact me on :<br/>
[kavithmathushal9007@gmail.com](https://www.kavithmathushal9007@gmail.com)<br/><br/>

<div align="center">

#### This project is licensed under the [Apache License](LICENSE)

#### © 2024 All Right Reserved, Designed By [Kavithma Thushal](https://github.com/Kavithma-Thushal)

</div>