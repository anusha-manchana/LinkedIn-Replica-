package com.example.kodemdemo1.userModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {  

    @Autowired
    private ProfileRepository profileRepository;


    public void createProfile(Profile profile){
        profileRepository.save(profile);
    }

   
    public Profile getProfile(String username){
        return profileRepository.findByUsername(username).get();
    }

    public List<Profile> getAllProfiles(){
        return profileRepository.findAll();
    }

  
    public void updateProfile(Profile profile, String username) {
        Profile oldProfile = profileRepository.findByUsername(username).get();
        profile.setId(oldProfile.getId());
        profileRepository.save(profile);
    }

    
    public void deleteProfile(String username) {
        Profile profile = profileRepository.findByUsername(username).get();
        profileRepository.delete(profile);
    }
}
