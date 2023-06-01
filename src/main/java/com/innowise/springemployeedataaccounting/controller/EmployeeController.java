package com.innowise.springemployeedataaccounting.controller;

import com.innowise.springemployeedataaccounting.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @GetMapping("")
    public List<Employee> getAllEmployees() {
        return new ArrayList<>();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeWithId() {
        return new Employee();
    }

    @PostMapping("")
    public Employee addEmployee() {
        return new Employee();
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeWithId() {
    }

    @PutMapping("/{id}")
    public Employee replaceEmployerr() {
        return new Employee();
    }



}
