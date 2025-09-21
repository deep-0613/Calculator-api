package com.example.calculator;

import org.springframework.web.bind.annotation.*;

@RestController                  // Marks this class as an API controller
@RequestMapping("/api")          // Base URL for all endpoints in this class
public class CalculatorController {

    // POST API endpoint: /api/calculate
    @PostMapping("/calculate")
    public double calculate(
            @RequestParam double num1,      // first number from request
            @RequestParam double num2,      // second number from request
            @RequestParam String operator   // operator: add, subtract, multiply, divide
    ) {
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
