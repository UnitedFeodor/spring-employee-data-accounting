package com.innowise.springemployeedataaccounting.controller;

import com.innowise.springemployeedataaccounting.dto.AddEmployeeDto;
import com.innowise.springemployeedataaccounting.dto.EditEmployeeDto;
import com.innowise.springemployeedataaccounting.dto.EmployeeDto;
import com.innowise.springemployeedataaccounting.dto.MapStructMapper;
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
    MapStructMapper mapper;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeDto> getAllEmployees() {
        return mapper.employeeListToEmployeeDtoList(employeeService.getAllEmployees());
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDto getEmployeeWithId(@PathVariable int id) {
        return mapper.employeeToEmployeeDto(employeeService.getEmployeeWithId(id));
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeDto addEmployee(@RequestBody AddEmployeeDto addEmployeeDto) {
        Employee employee = mapper.addEmployeeDtoToEmployee(addEmployeeDto);

        return mapper.employeeToEmployeeDto(employeeService.addEmployee(employee));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEmployeeWithId(@PathVariable int id) {
        employeeService.deleteEmployeeWithId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public EmployeeDto editEmployee(@PathVariable int id,
                                    @RequestBody EditEmployeeDto editEmployeeDto) {
        Employee employee = mapper.editEmployeeDtoToEmployee(editEmployeeDto);

        return mapper.employeeToEmployeeDto(employeeService.editEmployee(id, employee));
    }



}
