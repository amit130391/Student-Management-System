# 🎓 Student Management System

A simple Spring Boot CRUD application for managing student records. This project covers:

- Spring Boot REST APIs
- Spring Data JPA for database operations
- MySQL integration
- Global Exception Handling
- Lombok for boilerplate code reduction

---

## 🚀 Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Lombok
- Maven

---

## 🔧 Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR-USERNAME/student-management-system.git
cd student-management-system
```

### 2. Configure MySQL

Create a database in MySQL:

```sql
CREATE DATABASE studentdb;
```

Update your `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Run the Application

Use Maven to run the project:

```bash
./mvnw spring-boot:run
```

Or run `StudentManagementApplication.java` from your IDE.

---

## 🛠️ API Endpoints

| Method | Endpoint         | Description          |
|--------|------------------|----------------------|
| GET    | `/students`      | Get all students     |
| GET    | `/students/{id}` | Get student by ID    |
| POST   | `/students`      | Add a new student    |
| PUT    | `/students/{id}` | Update student by ID |
| DELETE | `/students/{id}` | Delete student by ID |

---

## ❌ Exception Handling

The application has global exception handling using `@ControllerAdvice`, catching:

- `StudentNotFoundException`

---

## 📦 Project Structure

```
src/
├── controller/
├── entity/
├── exception/
├── repository/
├── service/
└── StudentManagementApplication.java
```
Thank You
