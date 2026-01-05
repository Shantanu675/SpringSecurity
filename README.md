# 🔐 Spring Boot JWT Authentication Practice

This repository is created to **practice and understand JWT (JSON Web Token) based authentication** using **Spring Boot**.  
The project focuses on securing REST APIs using **username and password authentication**, generating JWT tokens, and protecting endpoints with Spring Security.

---

## 🚀 Features

- User authentication using **username & password**
- JWT token generation on successful login
- Secured REST endpoints using **Spring Security**
- Stateless authentication (no server-side session)
- Custom authentication and authorization flow
- Token validation for protected APIs

---

## 🛠 Tech Stack

- **Java**
- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Token)**
- **REST APIs**
- **Maven**

---

## 🔑 Authentication Flow

1. User sends **username & password** to the authentication endpoint
2. Credentials are validated using Spring Security
3. A **JWT token** is generated and returned
4. Client sends the token in the **Authorization Header**
5. Secured endpoints are accessed after token validation

---

## 🔒 Secured Endpoints

- Public endpoints: Login / Authentication
- Protected endpoints: Accessible only with a valid JWT token

---

## 📌 Purpose of This Repository

- Hands-on practice of **JWT authentication**
- Understanding how **Spring Security works internally**
- Learning how to **secure APIs** in real-world applications
- Building a strong backend foundation for enterprise-level projects

