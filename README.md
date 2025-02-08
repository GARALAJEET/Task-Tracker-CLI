Task Tracker CLI (Spring Boot)

Overview

The Task Tracker CLI is a simple command-line interface (CLI) application built using Java Spring Boot. This project allows users to track tasks efficiently by performing CRUD operations such as adding, updating, deleting, and displaying tasks. The task list is stored in a MySQL database, and tasks are categorized into different statuses: To-Do, In-Progress, and Done.

Features

Add a new task

Add Multiple New task

Update an existing task

Delete a task by ID

Delete all tasks

Display all tasks

Filter tasks by status (To-Do, In-Progress, Done)

Technologies Used

Java (Spring Boot)

Spring Data JPA

Hibernate (ORM framework)

MySQL (Relational database)

Postman (For API testing)

Project Setup

Prerequisites

Before running the project, ensure you have the following installed:

Java JDK 17+

Maven

MySQL Database

Postman (Optional, for testing API requests)



Configure the Database

Create a MySQL database named task_tracker and update the application.properties file with your database credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/task_tracker?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Build and Run the Project

Use the following command to build and start the project:

mvn spring-boot:run

The application will run on http://localhost:8080/.

API Endpoints

1. Add a New Task

Request:

POST /tasks/add

Request Body (JSON):

{
  "description": "Complete project report",
  "status": "todo"
}
2. Add Multiple New Task

Request:

POST /tasks/addMultiple

[
  {
    
    "description": "Complete Spring Boot project setup",
    "status": "todo",
    "createdAt": "2025-02-07T10:00:00",
    "updatedAt": "2025-02-07T10:00:00"
  },
  {
    
    "description": "Fix API bug in task update feature",
    "status": "in-progress",
    "createdAt": "2025-02-06T14:30:00",
    "updatedAt": "2025-02-07T11:00:00"
  },
  {
    
    "description": "Write unit tests for TaskService",
    "status": "done",
    "createdAt": "2025-02-05T09:00:00",
    "updatedAt": "2025-02-06T15:45:00"
  },
  {
    
    "description": "Document API endpoints in Postman",
    "status": "todo",
    "createdAt": "2025-02-07T12:15:00",
    "updatedAt": "2025-02-07T12:15:00"
  },
  {
    
    "description": "Optimize database queries for performance",
    "status": "in-progress",
    "createdAt": "2025-02-04T08:00:00",
    "updatedAt": "2025-02-07T13:30:00"
  }
]


3. Update a Task

Request:

PUT /tasks/update/{id}

Request Body (JSON):

{
  "description": "Submit project report",
  "status": "in-progress"
}

4. Delete a Task by ID

Request:

DELETE /tasks/delete/{id}

5. Delete All Tasks

Request:

DELETE /tasks/deleteAll

6. Display All Tasks

Request:

GET /tasks/all

7. Filter Tasks by Status

Request:

GET /tasks/status/{status}

Example:

GET /tasks/status/todo
GET /tasks/status/in-progress
GET /tasks/status/done

Example Task Entries (JSON Format)

[
  {
    
    "description": "Complete the Spring Boot tutorial",
    "status": "todo",
    "createdAt": "2025-02-07T10:00:00",
    "updatedAt": "2025-02-07T10:00:00"
  },
  {
    
    "description": "Fix login issue in authorize_App",
    "status": "in-progress",
    "createdAt": "2025-02-06T14:30:00",
    "updatedAt": "2025-02-07T11:00:00"
  },
  {
   
    "description": "Write project documentation",
    "status": "done",
    "createdAt": "2025-02-05T09:00:00",
    "updatedAt": "2025-02-06T15:45:00"
  },
  {
  
    "description": "Refactor Task Service layer",
    "status": "todo",
    "createdAt": "2025-02-07T12:15:00",
    "updatedAt": "2025-02-07T12:15:00"
  },
  {
    
    "description": "Optimize database queries",
    "status": "in-progress",
    "createdAt": "2025-02-04T08:00:00",
    "updatedAt": "2025-02-07T13:30:00"
  },
  {

    "description": "Implement update API for tasks",
    "status": "done",
    "createdAt": "2025-02-03T18:00:00",
    "updatedAt": "2025-02-04T10:20:00"
  },
  {
    
    "description": "Test all API endpoints using Postman",
    "status": "todo",
    "createdAt": "2025-02-07T15:45:00",
    "updatedAt": "2025-02-07T15:45:00"
  },
  {
    
    "description": "Add error handling in controllers",
    "status": "in-progress",
    "createdAt": "2025-02-06T16:30:00",
    "updatedAt": "2025-02-07T09:10:00"
  },
  {
    
    "description": "Research Spring Security",
    "status": "todo",
    "createdAt": "2025-02-07T17:20:00",
    "updatedAt": "2025-02-07T17:20:00"
  },
  {
    
    "description": "Deploy project on a cloud server",
    "status": "todo",
    "createdAt": "2025-02-07T18:30:00",
    "updatedAt": "2025-02-07T18:30:00"
  }
]





