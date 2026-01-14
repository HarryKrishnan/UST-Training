package com.ust.assignment;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String validateLogin(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "Success";
        }
        return "Failure";
    }
}
