package com.arvind.auth.springsecurity.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping
public class UserResource {
    @GetMapping("/")
    public ResponseEntity<String> getUserUnSecured() {
        return new ResponseEntity<>("all user info is available with unsecured way.", HttpStatus.OK);
    }

    @GetMapping("/users")
    public Principal getUserSecured(Principal principal) {

        return principal;
    }
}
