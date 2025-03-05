# ✅ **Task Tracker CLI (Spring Boot)**

## 📌 Overview
The **Task Tracker CLI** is a command-line interface (CLI) application built using **Java Spring Boot**. This project enables users to efficiently manage tasks by performing **CRUD operations** such as adding, updating, deleting, and displaying tasks. The task list is stored in a **MySQL database**, with tasks categorized into different statuses: **To-Do, In-Progress, and Done**.

---

## 🚀 Features
- ➕ **Add a new task**
- ➕ **Add multiple new tasks**
- ✏️ **Update an existing task**
- ❌ **Delete a task by ID**
- ❌ **Delete all tasks**
- 📜 **Display all tasks**
- 🔍 **Filter tasks by status** (*To-Do, In-Progress, Done*)

---

## 🛠️ Technologies Used
- ☕ **Java (Spring Boot)**
- 🏛 **Spring Data JPA**
- 🔄 **Hibernate (ORM framework)**
- 🗄 **MySQL (Relational database)**
- 🛠 **Postman (For API testing)**

---

## ⚙️ Project Setup

### ✅ **Prerequisites**
Before running the project, ensure you have the following installed:
- 📌 **Java JDK 17+**
- 📌 **Maven**
- 📌 **MySQL Database**
- 📌 **Postman (Optional, for testing API requests)**

### 🏗 **Configure the Database**
Create a **MySQL database** named `task_tracker` and update the **application.properties** file with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_tracker?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### ▶️ **Build and Run the Project**
Use the following command to build and start the project:
```sh
mvn spring-boot:run
```
The application will run on **http://localhost:8080/**.

---

## 🔗 API Endpoints

### 1️⃣ **Add a New Task**
**Request:**
```
POST /tasks/add
```
**Request Body (JSON):**
```json
{
  "description": "Complete project report",
  "status": "todo",
  "createdAt": "2025-02-05T09:00:00",
  "updatedAt": "2025-02-06T15:45:00"
}
```

### 2️⃣ **Add Multiple New Tasks**
**Request:**
```
POST /tasks/addMultiple
```
**Request Body (JSON):**
```json
[
  { "description": "Complete Spring Boot project setup", "status": "todo" },
  { "description": "Fix API bug in task update feature", "status": "in-progress" },
  { "description": "Write unit tests for TaskService", "status": "done" },
  { "description": "Document API endpoints in Postman", "status": "todo" },
  { "description": "Optimize database queries for performance", "status": "in-progress" }
]
```

### 3️⃣ **Update a Task**
**Request:**
```
PUT /tasks/update/{id}
```
**Request Body (JSON):**
```json
{
  "description": "Submit project report",
  "status": "in-progress"
}
```

### 4️⃣ **Delete a Task by ID**
**Request:**
```
DELETE /tasks/delete/{id}
```

### 5️⃣ **Delete All Tasks**
**Request:**
```
DELETE /tasks/deleteAll
```

### 6️⃣ **Display All Tasks**
**Request:**
```
GET /tasks/all
```

### 7️⃣ **Filter Tasks by Status**
**Request:**
```
GET /tasks/status/{status}
```
**Examples:**
```
GET /tasks/status/todo
GET /tasks/status/in-progress
GET /tasks/status/done
```

---

## 📌 **Example Task Entries (JSON Format)**
```json
[
  { "description": "Complete the Spring Boot tutorial", "status": "todo" },
  { "description": "Fix login issue in authorize_App", "status": "in-progress" },
  { "description": "Write project documentation", "status": "done" },
  { "description": "Refactor Task Service layer", "status": "todo" },
  { "description": "Optimize database queries", "status": "in-progress" },
  { "description": "Implement update API for tasks", "status": "done" },
  { "description": "Test all API endpoints using Postman", "status": "todo" },
  { "description": "Add error handling in controllers", "status": "in-progress" },
  { "description": "Research Spring Security", "status": "todo" },
  { "description": "Deploy project on a cloud server", "status": "todo" }
]
```

---

**🎯 Now you're ready to build and test the Task Tracker CLI with Spring Boot! 🚀**

