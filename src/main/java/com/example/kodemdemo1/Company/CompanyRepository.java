package com.example.kodemdemo1.Company;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, String> {

  
    Optional<Company> findBySlug(String slug);
}