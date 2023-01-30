package com.afroze.projectmanagement.company.api.domain;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
@Table(name = "business_unit", indexes = {
        @Index(name = "idx_businessunit_id", columnList = "id")
})
public class BusinessUnit extends AbstractAuditable<BusinessUnit, Long> {
    private String name;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessUnit that = (BusinessUnit) o;
        return name.equals(that.name) && company.equals(that.company);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}