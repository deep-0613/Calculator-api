package com.example.calculator;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class CalculatorController {

    // DTO for request
    public static class CalcRequest {
        public double num1;
        public double num2;
        public String operator;
    }

    @PostMapping("/calculate")
    public double calculate(@RequestBody CalcRequest request) {
        double num1 = request.num1;
        double num2 = request.num2;
        String operator = request.operator;

        switch (operator.toLowerCase()) {
            case "add":
                return num1 + num2;
            case "subtract":
                return num1 - num2;
            case "multiply":
                return num1 * num2;
            case "divide":
                if (num2 == 0) throw new ArithmeticException("Division by zero not allowed");
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator. Use add, subtract, multiply, divide.");
        }
    }
}
