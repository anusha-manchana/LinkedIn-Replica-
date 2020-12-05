package com.example.kodemdemo1.userModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {

    Optional<Profile> findByUsername(String username);
}
