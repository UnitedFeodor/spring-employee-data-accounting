package com.innowise.springemployeedataaccounting.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Company {
    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    Integer id;

    @Column(name = "c_name")
    String name;


    // TODO instead use dtos
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    @JsonManagedReference
    List<Employee> employeeList;
}
