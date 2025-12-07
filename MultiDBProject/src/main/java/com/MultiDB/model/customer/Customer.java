package com.MultiDB.model.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Auto increment primary key
    private Integer id;

    private String cname;
    private String email;

    // Default constructor (required by JPA)
    public Customer() {}

    // Parameterized constructor
    public Customer(Integer id, String cname, String email) {
        this.id = id;
        this.cname = cname;
        this.email = email;
    }

    // Getters & Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCname() {
        return cname;
    }
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", cname=" + cname + ", email=" + email + "]";
    }
}
