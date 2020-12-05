package com.example.kodemdemo1.Education;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.kodemdemo1.Institute.Institute;
import com.example.kodemdemo1.userModel.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {

    @Autowired
    private EducationRepository educationRepository;

  
    public void addEducation(Education education) {

       
        educationRepository.save(education);
    }

    
    public List<Education> getAllEducations(String username) {
        List<Education> educations = new ArrayList<>();
        educationRepository.findByUserUsername(username).forEach(educations::add);
        return educations;
    }

    public Optional<Education> getEducation(Integer id) {
        return educationRepository.findById(id);
    }

   
    public Optional<Education> getByCompanyAndUser(Institute institute, Profile user) {
        return educationRepository.findByInstituteAndUser(institute, user);
    }

 
    public void updateEducation(Education education) {
        educationRepository.save(education);
    }

   
    public void deleteEducation(int id) {
        educationRepository.deleteById(id);
    }
}