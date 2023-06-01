package com.innowise.springemployeedataaccounting.service;

import com.innowise.springemployeedataaccounting.dao.EmployeeRepository;
import com.innowise.springemployeedataaccounting.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeWithId(int id) {
        return employeeRepository.findById(id).orElseThrow(); // TODO custom exception
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeWithId(int id) {
        employeeRepository.deleteById(id);
    }

    public Employee replaceEmployee(int id, Employee employee) {
        employee.setId(id);
        return employeeRepository.save(employee);
    }
}
