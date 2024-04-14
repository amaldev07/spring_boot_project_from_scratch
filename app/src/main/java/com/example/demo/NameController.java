package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @PostMapping("/fullname")
    public String getFullName(@RequestBody FullNameRequest fullNameRequest) {
        String firstName = fullNameRequest.getFirstName();
        String lastName = fullNameRequest.getLastName();
        String fullName = firstName + " " + lastName;
        return "Full name is " +fullName;
    }
}
