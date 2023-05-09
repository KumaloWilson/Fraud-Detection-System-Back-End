package com.steward.system;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmailController {
    @Autowired
    private EmailRepository emailRepository;
    
    @PostMapping("/registeremail")
    public Email Registeremail(@RequestBody Email email) {
        return emailRepository.save(email);
    }

    @PostMapping("/findemail")
    public Email Findemail(@RequestBody Email email) {
        Email oldEmail = emailRepository.findByReceiverAndCcfield(email.receiver, email.ccfield);
        return oldEmail;
    }
}
