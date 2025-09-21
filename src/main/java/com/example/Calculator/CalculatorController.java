package com.example.calculator;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") // allow requests from any origin
@RestController
@RequestMapping("/api")
public class CalculatorController {

    @PostMapping("/calculate")
    public double calculate(
            @RequestBody double num1,
            @RequestBody double num2,
            @RequestBody String operator
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
