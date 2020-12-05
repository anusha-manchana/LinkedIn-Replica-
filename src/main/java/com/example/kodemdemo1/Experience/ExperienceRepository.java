package com.example.kodemdemo1.Experience;

import java.util.List;
import java.util.Optional;

import com.example.kodemdemo1.Company.Company;
import com.example.kodemdemo1.userModel.Profile;

import org.springframework.data.repository.CrudRepository;

public interface ExperienceRepository extends CrudRepository<Experience, Integer> {

	List<Experience> findByUserUsername(String username);

    Optional<Experience> findByCompanyAndUser(Company company, Profile user);
    
}
