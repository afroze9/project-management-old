package com.afroze.projectmanagement.company.api.service;

import com.afroze.projectmanagement.company.api.dto.CompanyDto;

import java.util.List;

public interface CompanyService {
    List<CompanyDto> getCompanies();
    CompanyDto getCompanyById(long companyId);
    CompanyDto createCompany(CompanyDto company);
}
