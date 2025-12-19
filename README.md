# Rest Assured API Automation – User CRUD Framework

## 📌 Project Overview
This project demonstrates end-to-end API automation using **Rest Assured + TestNG**.
It covers complete **CRUD operations** on a User Management API with proper validations
and framework design.

## 🔧 Tech Stack
- Java
- Rest Assured
- TestNG
- Maven
- Jackson (POJO Serialization/Deserialization)

## 🧱 Framework Structure
- **endpoints** – API endpoint definitions
- **payload** – POJO classes for request bodies
- **testcases** – TestNG test classes
- **utilities** – reusable utilities (future enhancement)

🔁 CRUD Flow
1️. CREATE USER (POST)

Create a user
Extract id
Validate response

2️. GET USER (GET)

Fetch user using extracted id
Validate details

3️. UPDATE USER (PUT)

Update name/job
Validate updated fields

4️. DELETE USER (DELETE)

Delete user
Validate status code

## 🔁 Test Scenarios Covered
1. Create User (POST)
2. Get User (GET)
3. Update User (PUT)
4. Delete User (DELETE)

Dynamic data such as **User ID** is extracted and reused across test cases.

## ▶️ How to Run Tests
```bash
mvn test
