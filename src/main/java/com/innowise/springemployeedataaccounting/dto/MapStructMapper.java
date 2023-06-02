package com.innowise.springemployeedataaccounting.dto;


import com.innowise.springemployeedataaccounting.model.Company;
import com.innowise.springemployeedataaccounting.model.Employee;
import com.innowise.springemployeedataaccounting.model.Role;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {


    EmployeeDto employeeToEmployeeDto(Employee employee);
    Employee employeeDtoToEmployee(EmployeeDto employeeDto);

    List<EmployeeDto> employeeListToEmployeeDtoList(List<Employee> employee);

    Employee addEmployeeDtoToEmployee(AddEmployeeDto addEmployeeDto);

    Employee editEmployeeDtoToEmployee(EditEmployeeDto editEmployeeDto);

    Employee loginDtoToEmployee(LoginDto editEmployeeDto);

    Role roleDtoToRole(RoleDto roleDto);
    Company companyDtoToCompany(CompanyDto companyDto);



}
