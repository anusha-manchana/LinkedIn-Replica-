package com.example.kodemdemo1.userModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;
    
    @PostMapping
    public void create(@RequestBody Profile profile){
        profileService.createProfile(profile);
    }

    @GetMapping("/{username}")
    public Profile getProfile(@PathVariable String username){
        return profileService.getProfile(username);
    }

    @GetMapping
    public List<Profile> getProfiles(){
        return profileService.getAllProfiles();
    }

    @PutMapping("/{username}")
    public void update(@RequestBody Profile profile, @PathVariable String username){
        profileService.updateProfile(profile, username);
    }

    @DeleteMapping("/{username}")
    public void delete(@PathVariable String username){
        profileService.deleteProfile(username);
    }
}
