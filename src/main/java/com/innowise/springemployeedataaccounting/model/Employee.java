package com.innowise.springemployeedataaccounting.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "e_id")
    Integer id;
    @Column(name = "e_name")
    String name;
    @Column(name = "e_surname")
    String surname;
    @Column(name = "e_position")
    String position;
    @Column(name = "e_birth_date")
    LocalDate birthDate;
    @Column(name = "e_email")
    String email;
    @Column(name = "e_password")
    String password;

    // TODO instead use dtos
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "e_company_id")
    @JsonBackReference
    Company company;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "e_role_id")
    @JsonBackReference
    Role role;

}
