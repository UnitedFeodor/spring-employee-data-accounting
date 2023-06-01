package com.innowise.springemployeedataaccounting.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_id")
    Integer id;
    @Column(name = "r_name")
    String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
    List<Employee> employeeList;
}
