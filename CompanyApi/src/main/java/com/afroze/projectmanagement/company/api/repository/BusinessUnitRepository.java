package com.afroze.projectmanagement.company.api.repository;

import com.afroze.projectmanagement.company.api.domain.BusinessUnit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessUnitRepository extends JpaRepository<BusinessUnit, Long> {
}
