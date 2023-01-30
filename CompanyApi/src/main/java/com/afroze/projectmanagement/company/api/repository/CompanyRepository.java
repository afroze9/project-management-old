package com.afroze.projectmanagement.company.api.repository;

import com.afroze.projectmanagement.company.api.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}

