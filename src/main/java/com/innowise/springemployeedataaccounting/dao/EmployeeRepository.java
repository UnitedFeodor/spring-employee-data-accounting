package com.innowise.springemployeedataaccounting.dao;

import com.innowise.springemployeedataaccounting.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface EmployeeRepository extends ListCrudRepository<Employee, Integer> {


}
