package com.Routez.service;


import com.Routez.entity.UserRegistration;
import com.Routez.payload.UserRegistrationDto;
import com.Routez.repository.UserRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegistationService {

    @Autowired
    private UserRegistrationRepository userRegistrationRepository;

    public UserRegistrationDto createUser(UserRegistration userRegistration){
        userRegistrationRepository.save(userRegistration);
           return null;

    }

    public UserRegistration getUserById(long id) {
        return userRegistrationRepository.findById(id).get();

    }
}
