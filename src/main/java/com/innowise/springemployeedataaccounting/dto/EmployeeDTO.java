package com.innowise.springemployeedataaccounting.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class EmployeeDTO {

    Integer id;
    String name;
    String surname;
    String position;
    LocalDate birthDate;
    String email;
    CompanyDTO company;
    RoleDTO role;
}
