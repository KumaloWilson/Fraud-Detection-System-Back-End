package com.steward.system;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="emails")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "receiver")
    String receiver;
    @Column(name = "ccfield")
    String ccfield;
    @Column(name = "bbfield")
    String bbfield;
    @Column(name = "subject")
    String subject;
    @Column(name = "body")
    String body;
    
}
