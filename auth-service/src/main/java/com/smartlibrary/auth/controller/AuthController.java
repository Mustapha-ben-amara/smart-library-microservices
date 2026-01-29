package com.smartlibrary.auth.controller;

import com.smartlibrary.auth.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        // VITRINE : user en dur
        if ("admin".equals(request.getUsername()) &&
                "admin123".equals(request.getPassword())) {

            return "JWT_WILL_BE_HERE";
        }

        throw new RuntimeException("Invalid credentials");
    }
}
