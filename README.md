
#  Student Management System (Java + JDBC + PostgreSQL)

A simple **console-based Student Management System** built in Java, using **JDBC** for database connectivity and **PostgreSQL** as the backend database.  
This project is my first hands-on implementation to practice **JDBC, SQL, and Maven** before moving into frameworks like Spring Boot.

---

## 📌 Features
- ➕ Add a new student  
- ✏️ Update student details  
- ❌ Delete a student  
- 📋 List all students  
- 🔎 Search student by:
  - ID  
  - Name (supports multiple students with same name)  
  - Phone number  

---

## 🛠️ Tech Stack
- **Java (JDK 8+)**
- **PostgreSQL** (Database)
- **JDBC** (Database connectivity)
- **Maven** (Dependency management)

---

## 🗄️ Database Schema

```sql
CREATE TABLE studentmng (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    marks FLOAT,
    phone V

