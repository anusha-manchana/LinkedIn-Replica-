package com.example.kodemdemo1.Education;

import java.util.List;
import java.util.Optional;

import com.example.kodemdemo1.Institute.Institute;
import com.example.kodemdemo1.userModel.Profile;

import org.springframework.data.repository.CrudRepository;

public interface EducationRepository extends CrudRepository<Education, Integer> {

    List<Education> findByUserUsername(String username);

    Optional<Education> findByInstituteAndUser(Institute institute, Profile user);
}