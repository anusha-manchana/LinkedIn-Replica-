package com.example.kodemdemo1.Language;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface LanguageRepository extends CrudRepository<Language, String> {

  
    Optional<Language> findBySlug(String slug);
}