package com.innowise.springemployeedataaccounting.dao;


import com.innowise.springemployeedataaccounting.model.Company;
import org.springframework.data.repository.ListCrudRepository;

public interface CompanyRepository extends ListCrudRepository<Company,Integer> {
}
