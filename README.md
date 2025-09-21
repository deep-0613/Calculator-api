# Calculator API

A simple calculator web application with a Spring Boot backend and a frontend built using HTML, CSS, and JavaScript.

---

## Features

- Addition, Subtraction, Multiplication, Division
- Connects frontend to backend API
- Can be deployed online or run locally

---

## Response Example

50.0

yaml
Copy code

---

## Run Locally

1. **Clone the repository:**

```bash
git clone https://github.com/deep-0613/Calculator-api.git
Navigate to the project folder:

bash
Copy code
cd Calculator-api
Run the Spring Boot application:

bash
Copy code
mvn spring-boot:run
Open your browser at http://localhost:8080 to use the calculator.

Testing via Postman
Open Postman and create a POST request to:

bash
Copy code
http://localhost:8080/api/calculate
Set Headers:

pgsql
Copy code
Content-Type: application/json
Set Body as raw JSON. Example:

json
Copy code
{
  "num1": 10,
  "num2": 40,
  "operator": "add"
}
Click Send. You should receive:

Copy code
50.0
For the deployed version on Render, replace localhost:8080 with your Render API URL.

Deployment
The project can be deployed to services like Render or Heroku.

Make sure to set the backend API URL in your frontend code:

javascript
Copy code
const response = await fetch("https://your-render-url/api/calculate", {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify({ num1, num2, operator })
});
Technologies Used
Java 17

Spring Boot 3

HTML, CSS, JavaScript

