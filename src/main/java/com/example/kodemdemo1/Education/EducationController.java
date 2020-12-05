package com.example.kodemdemo1.Education;

import java.util.List;
import java.util.Optional;


import com.example.kodemdemo1.Institute.Institute;
import com.example.kodemdemo1.Institute.InstituteRepository;
import com.example.kodemdemo1.userModel.Profile;
import com.example.kodemdemo1.userModel.ProfileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/education") 
public class EducationController {

    @Autowired
    private EducationService educationService;

    @Autowired
    private ProfileRepository userRepository;

    @Autowired
    private InstituteRepository instituteRepository;


    @PostMapping
    public void createExp(@RequestBody EducationSerializer educationSerializer) {

        Profile user = userRepository.findByUsername(educationSerializer.getUser()).get();

        Institute institute = instituteRepository.findBySlug(educationSerializer.getInstitute()).get();

        Education education = new Education(institute, educationSerializer.getStartMonth(),
                educationSerializer.getEndMonth(), educationSerializer.getDescription(),
                educationSerializer.getCourse(), user);

        Optional<Education> existingEducation = educationService.getByCompanyAndUser(institute, user);
        if (existingEducation.isPresent()) {

            education.setId(existingEducation.get().getId());
        }

        educationService.addEducation(education);
    }

    @GetMapping("/{id}")
    public Optional<Education> getExp(@PathVariable int id) {
        return educationService.getEducation(id);
    }

   
    @GetMapping
    public List<Education> getExp(@RequestParam("user") String username) {
        return educationService.getAllEducations(username);
    }

    @PutMapping("/{id}")
    public void updateExp(@RequestBody EducationSerializer educationSerializer, @PathVariable Integer id) {

        
        Education education = educationService.getEducation(id).orElseThrow();

        Profile user = userRepository.findByUsername(educationSerializer.getUser()).get();

      
        Institute institute = instituteRepository.findBySlug(educationSerializer.getInstitute()).get();

        education = new Education(institute, educationSerializer.getStartMonth(), educationSerializer.getEndMonth(),
                educationSerializer.getDescription(), educationSerializer.getCourse(), user);

       
        education.setId(id);

        educationService.updateEducation(education);
    }

    @DeleteMapping("/{id}")
    public void deleteExp(@PathVariable int id) {

      
        educationService.deleteEducation(id);
    }
}