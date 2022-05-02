package com.aca.exam.exam3.entity;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name",nullable = false)
    private  String firstName;

    @Column(name = "second_name",nullable = false)
    private  String secondName;

    @Column(name = "passport_id",nullable = false)
    private String passportId;

    public User(String firstName, String secondName, String passportId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.passportId = passportId;
    }

    public Long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

}
