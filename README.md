Calculator API

A simple REST API calculator built with Spring Boot, allowing addition, subtraction, multiplication, and division. The project also includes a front-end HTML calculator that interacts with the API.

Features

Addition, subtraction, multiplication, and division.

REST API with POST requests.

Front-end HTML calculator with live interaction.

Cross-origin requests allowed (CORS enabled).

Deployable locally or on Render.

Demo

The API is deployed on Render:
https://calculator-api-cisu.onrender.com

API Usage
Endpoint
POST /api/calculate

Request Headers
Content-Type: application/json

Request Body
{
  "num1": 10,
  "num2": 40,
  "operator": "add"
}


Operators: add, subtract, multiply, divide

Response
50.0

Example with cURL
curl -X POST https://calculator-api-cisu.onrender.com/api/calculate \
-H "Content-Type: application/json" \
-d '{"num1":10,"num2":40,"operator":"add"}'

Testing in Postman

Open Postman.

Create a new POST request.

Enter the URL:

https://calculator-api-cisu.onrender.com/api/calculate


Go to the Headers tab and add:

Key	Value
Content-Type	application/json

Go to the Body tab, select raw and JSON, then paste:

{
  "num1": 10,
  "num2": 40,
  "operator": "add"
}


Click Send. You should receive:

50.0

Front-End Usage

HTML file: index.html

Connects to the API for live calculations.

Open index.html in the browser, enter numbers and select an operator, then click = to get the result.

Running Locally

Clone the repository:

git clone https://github.com/deep-0613/Calculator-api.git
cd Calculator-api


Make sure you have Java 17 and Maven installed.

Run the application:

mvn spring-boot:run


Open your browser:

http://localhost:8080/

Dependencies

Spring Boot 3.x

Maven

Java 17
