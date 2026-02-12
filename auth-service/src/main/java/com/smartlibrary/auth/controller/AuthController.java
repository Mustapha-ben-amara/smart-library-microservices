package com.smartlibrary.auth.controller;

import com.smartlibrary.auth.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;
/*
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

*/


import com.smartlibrary.auth.dto.LoginRequest;
import com.smartlibrary.auth.security.JwtService;
import org.springframework.web.bind.annotation.*;

        import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginRequest request) {


        String token = jwtService.generateToken(request.getUsername());

        return Map.of("token", token);
    }
}
