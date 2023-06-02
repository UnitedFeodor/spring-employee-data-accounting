package com.innowise.springemployeedataaccounting.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
public class EditEmployeeDTO {

    Integer id;
    String name;
    String surname;
    String position;
    LocalDate birthDate;
    String email;
    String password;
    CompanyDTO company;
    RoleDTO role;
}
