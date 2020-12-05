package com.example.kodemdemo1.Skills;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepository extends JpaRepository<Skills, Integer> {
    List<Skills> findByProfileUsername(String username);
}
