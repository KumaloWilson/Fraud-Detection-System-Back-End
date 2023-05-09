package com.steward.system;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegistrationController {
    @Autowired
    private RegistrationRepository registrationRepository;

    @PostMapping("/registeruser")
    public Registration Registeruser(@RequestBody Registration register) {
        return registrationRepository.save(register);
    }

    @PostMapping("/login")
    public Registration Login(@RequestBody Registration registration) {
        Registration oldUSer = registrationRepository.findByUseremailAndUserpassword(registration.useremail, registration.userpassword);
        return oldUSer;
    }
}
