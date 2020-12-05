package com.example.kodemdemo1.Institute;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstituteService {

    @Autowired
    private InstituteRepository instituteRepository;

    public void addInstitute(Institute institute) {
        instituteRepository.save(institute);
    }

    public Optional<Institute> getInstitute(String slug) {
        return instituteRepository.findById(slug);
    }

   
    public List<Institute> getAllInstitutes() {
        List<Institute> institutes = new ArrayList<>();
        instituteRepository.findAll().forEach(institutes::add);
        return institutes;
    }

   
    public void updateInstitute(Institute institute) {
        instituteRepository.save(institute);
    }

   
    public void deleteInstitute(String slug) {
        instituteRepository.deleteById(slug);
    }
}
