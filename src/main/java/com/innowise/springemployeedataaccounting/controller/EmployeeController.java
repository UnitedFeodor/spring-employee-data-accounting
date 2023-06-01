package com.innowise.springemployeedataaccounting.controller;

import com.innowise.springemployeedataaccounting.model.Employee;
import com.innowise.springemployeedataaccounting.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {

    EmployeeService employeeService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getEmployeeWithId(@PathVariable int id) {
        return employeeService.getEmployeeWithId(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployeeWithId(@PathVariable int id) {
        employeeService.deleteEmployeeWithId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee replaceEmployee(@PathVariable int id,
                                    @RequestBody Employee employee) {
        return employeeService.replaceEmployee(id, employee);
    }



}
