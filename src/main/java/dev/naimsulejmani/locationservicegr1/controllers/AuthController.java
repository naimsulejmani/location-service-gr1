package dev.naimsulejmani.locationservicegr1.controllers;

import dev.naimsulejmani.locationservicegr1.dtos.UserDto;
import dev.naimsulejmani.locationservicegr1.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/auth")
public class AuthController {

    private final UserService service;


    public AuthController(UserService service) {
        this.service = service;
    }

    @PostMapping("/signin")
    public ResponseEntity<?> signIn(@RequestBody UserDto userDto) {
        return null;
    }


    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody UserDto userDto) {
        return null;
    }
}
















