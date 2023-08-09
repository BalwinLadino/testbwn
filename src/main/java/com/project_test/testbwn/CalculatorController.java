package com.project_test.testbwn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/sum")
    public String sum(@RequestParam int a, @RequestParam int b) {
        int result = a + b;
        return "Suma: " + result;
    }

    @GetMapping("/subtract")
    public String subtract(@RequestParam int a, @RequestParam int b) {
        int result = a - b;
        return "Resta: " + result;
}
}