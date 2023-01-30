package com.afroze.projectmanagement.company.api.domain;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "company", indexes = {
        @Index(name = "idx_company_id", columnList = "id")
}, uniqueConstraints = {
        @UniqueConstraint(name = "uc_company_name", columnNames = {"name"})
})
public class Company extends AbstractAuditable<Company, Long> {

    private String name;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<BusinessUnit> businessUnits;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BusinessUnit> getBusinessUnits() {
        return businessUnits;
    }

    public void setBusinessUnits(List<BusinessUnit> businessUnits) {
        this.businessUnits = businessUnits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Company company = (Company) o;
        return name.equals(company.name) && businessUnits.equals(company.businessUnits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, businessUnits);
    }
}