package com.innowise.springemployeedataaccounting.controller;

import com.innowise.springemployeedataaccounting.dto.CompanyDto;
import com.innowise.springemployeedataaccounting.dto.MapStructMapper;
import com.innowise.springemployeedataaccounting.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@AllArgsConstructor
public class CompanyController {
    private CompanyService companyService;
    private MapStructMapper mapper;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<CompanyDto> getAllCompanies() {
        return mapper.companyListToCompanyDtoList(companyService.getAllCompanies());
    }
}
