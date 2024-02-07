# Basic Project with Kafka and Spring

## About the Project

This basic project demonstrates the integration between Apache Kafka and the Spring Framework. It aims to provide a practical, introductory example of how to use Kafka for producing and consuming messages within a Spring Boot application, with Kafka and Zookeeper configured via Docker Compose. This is ideal for those starting to explore Kafka's capabilities alongside the Spring ecosystem.

## Technologies Used

- **Spring Boot**: Simplifies the creation of stand-alone, production-grade Spring-based applications with minimal configuration.
- **Apache Kafka**: A distributed messaging system that enables data transmission between systems in a distributed, resilient, and scalable manner.
- **Spring Kafka**: Provides a "template" approach for sending Kafka messages and an abstraction for the Kafka message listener container for receiving messages.
- **Docker Compose**: Used to configure and start Kafka and Zookeeper in a simplified manner.

## Features

- **Message Production**: Implementation of a message producer that sends data to a Kafka topic.
- **Message Consumption**: Implementation of a message consumer that reads data from a Kafka topic and processes it.

## How to Run

### Prerequisites

- Java JDK 11 or higher
- Docker and Docker Compose installed and configured on your machine
- Maven for dependency management and project build

### Steps to Run

1. **Configure Kafka and Zookeeper with Docker Compose**: At the project's root, you will find a `docker-compose.yml` file containing the necessary configuration to start Kafka and Zookeeper. Execute the following command to start the services:
  `docker-compose up -d`
2. **Clone the Repository**: Clone this repository to your local machine using `git clone`.
3. **Configure Application**: The application is already configured to connect to Kafka and Zookeeper running via Docker Compose. Ensure the settings in the `application.properties` file are correct.
4. **Run the Application**: Navigate to the project's root and execute `mvn spring-boot:run` to start the application.

## Contributions

Contributions are always welcome! If you have any suggestions for improving this project, feel free to create a pull request or open an issue.
