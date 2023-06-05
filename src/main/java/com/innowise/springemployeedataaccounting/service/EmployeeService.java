package com.innowise.springemployeedataaccounting.service;

import com.innowise.springemployeedataaccounting.dao.CompanyRepository;
import com.innowise.springemployeedataaccounting.dao.EmployeeRepository;
import com.innowise.springemployeedataaccounting.dao.RoleRepository;
import com.innowise.springemployeedataaccounting.model.Company;
import com.innowise.springemployeedataaccounting.model.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    // TODO add validation
    EmployeeRepository employeeRepo;
    CompanyRepository companyRepo;
    RoleRepository roleRepo;

    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
    @Transactional
    public Employee getEmployeeWithId(int id) {
        return employeeRepo.findById(id).orElseThrow(); // TODO add custom exception
    }
    @Transactional
    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
    @Transactional
    public void deleteEmployeeWithId(int id) {
        employeeRepo.deleteById(id);
    }
    @Transactional
    public Employee editEmployee(int id, Employee employee) {
        employee.setId(id);
        return employeeRepo.save(employee);
    }
}
