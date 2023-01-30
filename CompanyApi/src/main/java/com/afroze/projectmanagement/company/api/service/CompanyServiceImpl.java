package com.afroze.projectmanagement.company.api.service;

import com.afroze.projectmanagement.company.api.domain.Company;
import com.afroze.projectmanagement.company.api.dto.CompanyDto;
import com.afroze.projectmanagement.company.api.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<CompanyDto> getCompanies() {
        List<Company> companies = companyRepository.findAll();
        return null;
    }

    @Override
    public CompanyDto getCompanyById(long companyId) {
        Optional<Company> company = companyRepository.findById(companyId);
        return null;
    }

    @Override
    public CompanyDto createCompany(CompanyDto company) {
        return null;
    }
}
