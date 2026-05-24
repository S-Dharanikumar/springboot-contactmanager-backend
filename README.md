Contact Manager Backend

A full-stack Contact Manager backend application built using Spring Boot, REST APIs, and H2 Database. This backend powers the Contact Manager frontend application developed with React.js.

🚀 Live Backend API

Live Backend API

🌐 Frontend Application

Live Frontend App

📌 Features
Create Contact
Read Contacts
Update Contact
Delete Contact
RESTful API Architecture
H2 In-Memory Database
Spring Boot Backend
CORS Enabled for Frontend Integration
Deployed on Render
🛠️ Tech Stack
Java 17
Spring Boot
Spring Data JPA
Maven
H2 Database
REST API
Render Deployment
📂 Project Structure
src
 └── main
      ├── java
      │    └── com.dharani.contactmanager
      │          ├── controller
      │          ├── entity
      │          ├── repository
      │          └── service
      └── resources
           └── application.properties
⚙️ API Endpoints
Method	Endpoint	Description
GET	/api/contacts	Get all contacts
GET	/api/contacts/{id}	Get contact by ID
POST	/api/contacts	Create new contact
PUT	/api/contacts/{id}	Update contact
DELETE	/api/contacts/{id}	Delete contact
▶️ Run Locally
Clone Repository
git clone https://github.com/S-Dharanikumar/springboot-contactmanager-backend.git
Navigate to Project
cd springboot-contactmanager-backend
Run Application
./mvnw spring-boot:run

Backend runs on:

http://localhost:8081
🗄️ Database Configuration

Currently using:

H2 In-Memory Database

Configured inside:

src/main/resources/application.properties
☁️ Deployment

Backend deployed using:

Render

Frontend deployed using:

Vercel

👨‍💻 Developer

Dharanikumar S

GitHub:
GitHub Profile

📖 Future Improvements
JWT Authentication
User Login & Registration
Cloud Database Integration
Role-Based Access Control
Docker Optimization
Swagger API Documentation
Pagination & Sorting
Search & Filtering
⭐ Project Status

✅ Frontend & Backend Integration Completed
✅ Full CRUD Operations Working
✅ Successfully Deployed Online
