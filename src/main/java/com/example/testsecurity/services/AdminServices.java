package com.example.testsecurity.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AdminServices {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void doAdminStuff(){
        System.out.println("ADMIN");
    }
}
