package com.steward.system;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email,Integer>{
    Email findByReceiverAndCcfield(String receiver,String ccfield);
}
