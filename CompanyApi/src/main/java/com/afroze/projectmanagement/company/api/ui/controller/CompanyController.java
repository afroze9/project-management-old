package com.afroze.projectmanagement.company.api.ui.controller;

import com.afroze.projectmanagement.company.api.ui.model.CompanyResponseModel;
import com.afroze.projectmanagement.company.api.ui.model.CompanyRequestModel;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/company")
public class CompanyController {
    @GetMapping()
    public ResponseEntity<List<CompanyResponseModel>> getAll() {
        return new ResponseEntity<>(null);
    }

    @GetMapping("/{companyId}")
    public ResponseEntity<CompanyResponseModel> getById(@PathVariable("companyId") String companyId) {
        return new ResponseEntity<>(null);
    }

    @PostMapping()
    public ResponseEntity<CompanyResponseModel> create(@RequestBody @Valid CompanyRequestModel company) {
        return new ResponseEntity<>(null);
    }
}
