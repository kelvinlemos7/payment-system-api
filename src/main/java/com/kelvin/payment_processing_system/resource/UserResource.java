package com.kelvin.payment_processing_system.resource;

import com.kelvin.payment_processing_system.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User("000.000.000-00", "teste@exemplo.com", 1L, "User Teste", "12345", LocalDateTime.now());
        return ResponseEntity.ok().body(u);
    }
}
