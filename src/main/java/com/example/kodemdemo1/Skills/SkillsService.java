package com.example.kodemdemo1.Skills;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {
    
    @Autowired
    private SkillsRepository skillsRepository;

    public void createSkill(Skills skill){
        skillsRepository.save(skill);
    }

    public List<Skills> getSkills(String username){
        return skillsRepository.findByProfileUsername(username);
    }

    public Optional<Skills> getSkill(Integer id){
        return skillsRepository.findById(id);
    }

    public void updateSkill(Skills skill, Integer id){
        skill.setId(id);
        skillsRepository.save(skill);
    }

    public void deleteSkill(Integer id){
        skillsRepository.deleteById(id);
    }
}
