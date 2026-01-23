package com.ust.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {

    @GetMapping("/age/{age}")
    public String checkAgeCategory(@PathVariable int age) {
        if (age < 18) {
            return "Child";
        } else if (age >= 18 && age <= 59) {
            return "Adult";
        } else {
            return "Senior Citizen";
        }
    }
}
