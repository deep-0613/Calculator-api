# Calculator API

A simple web-based calculator application with a **Spring Boot** backend and a frontend built using **HTML, CSS, and JavaScript**.  
Supports addition, subtraction, multiplication, and division.

---

## Features

- Perform basic arithmetic operations: Add, Subtract, Multiply, Divide
- Fully connected frontend and backend
- Can run locally or be deployed online
- Supports testing via Postman or any API client

---

## Live Demo

The Calculator app is deployed online and can be accessed here:  
[Live Calculator](https://calculator-api-cisu.onrender.com)

---

## Technologies Used

- Java 17
- Spring Boot 3
- HTML, CSS, JavaScript
- Maven

---
Testing via Postman

Open Postman and create a new POST request.

Set the URL to your deployed backend or local instance:

https://calculator-api-cisu.onrender.com/api/calculate

In the Headers tab, add:

Content-Type: application/json


In the Body tab, select raw → JSON, and provide:

{
  "num1": 10,
  "num2": 5,
  "operator": "add"
}


Send the request and check the response.
