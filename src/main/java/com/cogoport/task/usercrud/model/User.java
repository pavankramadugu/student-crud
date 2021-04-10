package com.cogoport.task.usercrud.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    public String getCollege() {
        return college;
    }

    private String college;

    public void setCollege(String college) {
        this.college = college;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String lastName;

    private String emailId;

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhone() {
        return phone;
    }

    private String phone;
}
