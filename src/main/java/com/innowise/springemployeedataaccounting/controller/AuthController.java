package com.innowise.springemployeedataaccounting.controller;

import com.innowise.springemployeedataaccounting.model.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/login")
    public Employee login() {
        return new Employee();
    }

    @PostMapping("/logout")
    public void logout() {
    }

}
