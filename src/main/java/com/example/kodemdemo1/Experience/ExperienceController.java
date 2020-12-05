package com.example.kodemdemo1.Experience;

import java.util.List;
import java.util.Optional;

import com.example.kodemdemo1.Company.Company;
import com.example.kodemdemo1.Company.CompanyRepository;
import com.example.kodemdemo1.userModel.ProfileRepository;
import com.example.kodemdemo1.userModel.Profile;

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
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @Autowired
    private ProfileRepository userRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping
    public void createExp(@RequestBody ExperienceRequestBody experienceSerializer) {

        Profile user = userRepository.findByUsername(experienceSerializer.getUser()).get();

        Company company = companyRepository.findBySlug(experienceSerializer.getCompany()).get();

        Experience experience = new Experience(experienceSerializer.getRole(), company,
                experienceSerializer.getStartMonth(), experienceSerializer.getEndMonth(),
                experienceSerializer.getDescription(), user);

        Optional<Experience> existingExperience = experienceService.getByCompanyAndProfile(company, user);
        if (existingExperience.isPresent()) {

            experience.setId(existingExperience.get().getId());
        }

        experienceService.addExperience(experience);
    }

    @GetMapping("/{id}")
    public Optional<Experience> getExp(@PathVariable int id) {
        return experienceService.getExperience(id);
    }

    @GetMapping
    public List<Experience> getExp(@RequestParam("user") String username) {
        return experienceService.getAllExperiences(username);
    }

    @PutMapping("/{id}")
    public void updateExp(@RequestBody ExperienceRequestBody experienceSerializer, @PathVariable Integer id) {

        Experience experience = experienceService.getExperience(id).orElseThrow();

        Profile user = userRepository.findByUsername(experienceSerializer.getUser()).get();

        Company company = companyRepository.findBySlug(experienceSerializer.getCompany()).get();

        experience = new Experience(experienceSerializer.getRole(), company, experienceSerializer.getStartMonth(),
                experienceSerializer.getEndMonth(), experienceSerializer.getDescription(), user);

        experience.setId(id);

        experienceService.updateExperience(experience);
    }

    @DeleteMapping("/{id}")
    public void deleteExp(@PathVariable int id) {

        experienceService.deleteExperience(id);
    }
}
