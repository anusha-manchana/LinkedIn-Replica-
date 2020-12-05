package com.example.kodemdemo1.Company;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping
    public void createCompany(@RequestBody Company company) {
        companyService.addCompany(company);
    }

    @GetMapping("/{slug}")
    public Optional<Company> getCompany(@PathVariable String slug) {
        return companyService.getCompany(slug);
    }

    @GetMapping
    public List<Company> getCompany() {
        return companyService.getAllCompanies();
    }

  
    @PutMapping("/{slug}")
    public void updateCompany(@RequestBody Company company) {
        companyService.updateCompany(company);
    }

   
    @DeleteMapping("/{slug}")
    public void deleteCompany(@PathVariable String slug) {
        companyService.deleteCompany(slug);
    }

}
