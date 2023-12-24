package com.example.testsecurity.controllers;

import com.example.testsecurity.services.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//@RestController
@Controller
public class HelloController {
    private final AdminServices adminServices;

    @Autowired
    public HelloController(AdminServices adminServices) {
        this.adminServices = adminServices;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/user")
    public String user() {
        return "User";
    }

    @GetMapping("/1")
    public String one() {
        return "1";
    }

    @GetMapping("/admin")
    public String adminPAge(){
        adminServices.doAdminStuff();
        return "admin";
    }
//    @GetMapping("/showUserInfo")
//    public String seyHello(){
//        return "hello";
//    }
//    public String showUserInfo() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();
//        System.out.println(personDetails.getPerson());
//
//        return "hello";
//    }
}
