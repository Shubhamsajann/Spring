package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Marks this class as a JPA entity (mapped to a DB table)
public class Vaccine {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    // IDENTITY = Auto-increment in MySQL
    private Integer id;

    private String vaccineName;      // Name of the vaccine
    private String vaccineCompany;   // Company that makes the vaccine
    private double cost;             // Cost of the vaccine

    // Parameterized constructor: used when creating an object with data
    public Vaccine(String vaccineName, String vaccineCompany, double cost) {
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.cost = cost;
    }

    // Default constructor: required by JPA/Hibernate
    public Vaccine() {
        super();
    }

    @Override
    public String toString() {
        // Used when printing the object (System.out.println(vaccine))
        return "Vaccine [id=" + id + ", vaccineName=" + vaccineName + ", vaccineCompany=" 
                + vaccineCompany + ", cost=" + cost + "]";
    }

    // Getter for ID (no setter because ID is auto-generated)
    public Integer getId() {
        return id;
    }
   

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCompany() {
        return vaccineCompany;
    }

    public void setVaccineCompany(String vaccineCompany) {
        this.vaccineCompany = vaccineCompany;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
}
