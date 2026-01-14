package com.ust.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestController {

    @GetMapping("/interest")
    public double calculateSimpleInterest(@RequestParam double p, @RequestParam double r, @RequestParam double t) {
        return (p * r * t) / 100;
    }
}
