package com.innowise.springemployeedataaccounting.service;

import com.innowise.springemployeedataaccounting.dao.CompanyRepository;
import com.innowise.springemployeedataaccounting.dto.CompanyDto;
import com.innowise.springemployeedataaccounting.model.Company;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyService {
    private CompanyRepository companyRepo;

    @Transactional
    public List<Company> getAllCompanies() {
        return companyRepo.findAll();
    }
}
