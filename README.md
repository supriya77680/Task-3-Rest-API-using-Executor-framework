# Mathematical Operations API

This Spring Boot project provides APIs for performing various mathematical operations such as square, cube, factorial, prime number check, Armstrong number check, reverse number, and even-odd number check. These operations are implemented in the service layer and accessed via controllers.

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
  - [Prerequisites](#prerequisites)
  - [Clone the Repository](#clone-the-repository)
  - [Database Configuration](#database-configuration)
  - [Build and Run](#build-and-run)
- [API Endpoints](#api-endpoints)
  - [Calculation](#calculation)

## Introduction
This project implements a set of mathematical operations as RESTful APIs using Spring Boot. Each operation is performed in the service layer and exposed through controllers, allowing clients to perform calculations and checks on numbers.

## Technologies Used
- Spring Boot
- Gradle (for dependency management)
- Java

## Setup Instructions
### Prerequisites
Ensure you have the following installed:
- Java Development Kit (JDK) 8 or higher
- Gradle

### Clone the Repository
Clone the Mathematical Operations API repository from GitHub:
```bash
git clone <repository_url>
```

### Build and Run
```bash
gradle build
gradle bootRun
```

### API Endpoints
```bash
http://localhost:8080/number/{number}
```
