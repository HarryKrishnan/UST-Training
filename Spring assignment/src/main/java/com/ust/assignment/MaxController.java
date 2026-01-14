package com.ust.assignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxController {

    @GetMapping("/max")
    public int findMax(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        return Math.max(a, Math.max(b, c));
    }
}
