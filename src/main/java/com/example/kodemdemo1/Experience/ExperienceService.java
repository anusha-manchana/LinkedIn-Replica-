package com.example.kodemdemo1.Experience;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.kodemdemo1.Company.Company;
import com.example.kodemdemo1.userModel.Profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;

    
    public void addExperience(Experience experience) {

       
        experienceRepository.save(experience);
    }

    public List<Experience> getAllExperiences(String username) {
        List<Experience> experiences = new ArrayList<>();
        experienceRepository.findByUserUsername(username).forEach(experiences::add);
        return experiences;
    }

    public Optional<Experience> getExperience(Integer id) {
        return experienceRepository.findById(id);
    }

   
    public Optional<Experience> getByCompanyAndProfile(Company company, Profile user) {
        return experienceRepository.findByCompanyAndUser(company, user);
    }

    
    public void updateExperience(Experience experience) {
        experienceRepository.save(experience);
    }

   
    public void deleteExperience(int id) {
        experienceRepository.deleteById(id);
    }
}
