package com.innowise.springemployeedataaccounting.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginDto {
    String email;
    String password;
}
