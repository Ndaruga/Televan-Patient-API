package com.sidar.telvan.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Patient_Details")

public class PatientDetails {

    @Id
    private int id;
    private String firstName;
    private char gender;
    private long phone;
    private String email;

    public PatientDetails() {
    }

    public PatientDetails(int id, String email, long phone, char gender, String firstName) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


