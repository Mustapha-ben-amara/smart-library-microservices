package com.smartlibrary.auth.controller;

import com.smartlibrary.auth.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;



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

        String role = request.getUsername().equals("admin") ? "ADMIN" : "USER";
        String token = jwtService.generateToken(request.getUsername(), role);
        return Map.of("token", token);
    }
}
