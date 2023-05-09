package com.steward.system;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration,Integer> {
    Registration findByUseremailAndUserpassword(String useremail,String userpassword);
}
