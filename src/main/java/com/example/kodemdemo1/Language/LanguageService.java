package com.example.kodemdemo1.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    @Autowired
    private LanguageRepository languageRepository;

  
    public void addLanguage(Language language) {
        languageRepository.save(language);
    }

   

    public Optional<Language> getLanguage(String slug) {
        return languageRepository.findById(slug);
    }

    public List<Language> getAllLanguages() {
        List<Language> languages = new ArrayList<>();
        languageRepository.findAll().forEach(languages::add);
        return languages;
    }

   
    public void updateLanguage(Language language) {
        languageRepository.save(language);
    }

    
    public void deleteLanguage(String slug) {
        languageRepository.deleteById(slug);
    }
}
