package com.example.kodemdemo1.Skills;

import java.util.List;
import java.util.Optional;

import com.example.kodemdemo1.Language.Language;
import com.example.kodemdemo1.Language.LanguageRepository;
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
@RequestMapping("/skills")
public class SkillsController {
    
    @Autowired
    private SkillsService skillsService;

    @Autowired
    private LanguageRepository languageRepository;

    @Autowired
    private ProfileRepository profileRepository;

    @PostMapping
    public void createSkill(@RequestBody SkillsRequestBody skill){
        Language language = languageRepository.findById(skill.getLanguage()).get();
        Profile profile = profileRepository.findByUsername(skill.getProfile()).get();
        Skills newSkill = new Skills(language, skill.getRating(), profile);
        skillsService.createSkill(newSkill);
    }

    @GetMapping
    public List<Skills> getAllSkills(@RequestParam("user") String username){
        System.out.println(username);
        return skillsService.getSkills(username);
    }

    @GetMapping("/{id}")
    public Optional<Skills> getSkill(@PathVariable Integer id ){
        return skillsService.getSkill(id);
    }


    @PutMapping("/{id}")
    public void updateSkill(@RequestBody SkillsRequestBody skill, @PathVariable Integer id) {
        Language language = languageRepository.findById(skill.getLanguage()).get();
        Profile profile = profileRepository.findByUsername(skill.getProfile()).get();
        Skills newSkill = new Skills(language, skill.getRating(), profile);
        skillsService.updateSkill(newSkill, id);
    }

    @DeleteMapping("/{id}")
    public void deleteSkill(@PathVariable Integer id) {
        skillsService.deleteSkill(id);
    }


}
