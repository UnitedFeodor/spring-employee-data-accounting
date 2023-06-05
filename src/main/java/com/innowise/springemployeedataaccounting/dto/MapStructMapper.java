package com.innowise.springemployeedataaccounting.dto;


import com.innowise.springemployeedataaccounting.model.Company;
import com.innowise.springemployeedataaccounting.model.Employee;
import com.innowise.springemployeedataaccounting.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    String COMPANY_TO_ID = "companyToId";
    String ROLE_TO_ID = "roleToId";
    String ID_TO_ROLE = "idToRole";
    String ID_TO_COMPANY = "idToCompany";


    @Mapping(source = "employee.company", target = "company",qualifiedByName = COMPANY_TO_ID)
    @Mapping(source = "employee.role", target = "role",qualifiedByName = ROLE_TO_ID)
    EmployeeDto employeeToEmployeeDto(Employee employee);


    @Mapping(source = "employeeDto.company", target = "company",qualifiedByName = ID_TO_COMPANY)
    @Mapping(source = "employeeDto.role", target = "role",qualifiedByName = ID_TO_ROLE)
    Employee employeeDtoToEmployee(EmployeeDto employeeDto);

    @Mapping(source = "employee.company", target = "company",qualifiedByName = COMPANY_TO_ID)
    @Mapping(source = "employee.role", target = "role",qualifiedByName = ROLE_TO_ID)
    List<EmployeeDto> employeeListToEmployeeDtoList(List<Employee> employee);

    @Mapping(source = "addEmployeeDto.company", target = "company",qualifiedByName = ID_TO_COMPANY)
    @Mapping(source = "addEmployeeDto.role", target = "role",qualifiedByName = ID_TO_ROLE)
    Employee addEmployeeDtoToEmployee(AddEmployeeDto addEmployeeDto);

    @Mapping(source = "editEmployeeDto.company", target = "company",qualifiedByName = ID_TO_COMPANY)
    @Mapping(source = "editEmployeeDto.role", target = "role",qualifiedByName = ID_TO_ROLE)
    Employee editEmployeeDtoToEmployee(EditEmployeeDto editEmployeeDto);

    Employee loginDtoToEmployee(LoginDto editEmployeeDto);

    @Named(COMPANY_TO_ID)
    static Integer companyToId(Company company) {
        return company != null ? company.getId() : null;
    }

    @Named(ROLE_TO_ID)
    static Integer roleToId(Role role) {
        return role != null ? role.getId() : null;
    }

    @Named(ID_TO_COMPANY)
    static Company idToCompany(Integer companyId) {
        if (companyId == null) {
            return null;
        }
        Company company = new Company();
        company.setId(companyId);
        return company;

    }

    @Named(ID_TO_ROLE)
    static Role idToRole(Integer roleId) {
        if (roleId == null) {
            return null;
        }
        Role role = new Role();
        role.setId(roleId);
        return role;
    }



}
