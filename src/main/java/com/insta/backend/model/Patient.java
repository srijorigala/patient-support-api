package com.insta.backend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String insuranceType;
    private double annualIncome;

public Patient() {
    }
    public Patient(
          
            String firstName,
            String lastName,
            String email,
            String insuranceType,
            double annualIncome) {

       
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.insuranceType = insuranceType;
        this.annualIncome = annualIncome;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
     public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
}