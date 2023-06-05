package com.innowise.springemployeedataaccounting.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AddEmployeeDto {
    String name;
    String surname;
    String position;
    LocalDate birthDate;
    String email;
    String password;
    Integer company;
    Integer role;

}
