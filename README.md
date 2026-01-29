# 🧩 C2TC Sprint 1 – Spring Boot Backend Projects

This repository contains **Spring Boot backend applications** developed as part of the **C2TC Sprint 1 Training**.

The projects demonstrate REST API development, Spring Boot architecture, and database integration using JPA.

---

## 🚀 Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Maven
- MySQL
- REST APIs

---

## 📁 Repository Structure

C2TC_Sprint1Project
┣ ShopOwnerModule
┗ demo


---

## 🏪 Project 1: ShopOwnerModule

A complete Spring Boot backend application to manage Shop Owner details.

### Features

- Add Shop Owner
- View Shop Owners
- Update Shop Owner Details
- Delete Shop Owner
- JPA Repository Integration
- MVC Architecture

### Main Packages

ShopOwnerModule
┣ controller
┣ service
┣ repository
┣ entity
┗ ShopOwnerModuleApplication.java


---

## 🧪 Project 2: demo

A practice Spring Boot project created to understand:

- Spring Boot setup
- REST Controller creation
- application.properties configuration
- Maven project structure

---

## 🗄️ Database Configuration

Update `application.properties` in both projects:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
▶️ How to Run the Projects
Clone the repository

Open the project in Eclipse / IntelliJ

Configure MySQL database

Run the main class:

ShopOwnerModuleApplication.java

DemoApplication.java

Test APIs using Postman

📌 Sample API Endpoints
Method	URL	Description
GET	/owners	Get all shop owners
POST	/owners	Add new shop owner
PUT	/owners/{id}	Update shop owner
DELETE	/owners/{id}	Delete shop owner
🧠 Concepts Covered
Spring Boot Architecture

RESTful Web Services

Dependency Injection

JPA & Hibernate ORM

MVC Design Pattern

👨‍💻 Developed By
Dev Pradeesh
B.Tech Artificial Intelligence and Data Science

📜 Purpose
This repository is created for learning and demonstrating Spring Boot backend development as part of C2TC Sprint 1.


Commit it ✅  
Your Sprint1 repo will look professional.
::contentReference[oaicite:0]{index=0}
