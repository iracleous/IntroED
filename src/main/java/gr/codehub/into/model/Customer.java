/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.codehub.into.model;

import java.util.Date;

/**
 *
 * @author iracl
 */
public class Customer {
    private String name;
    private String surname;
    private String email;
    private double height;
    private double weight;
    private boolean active;
    private Date dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Customer(String name, String surname, String email, double height, double weight, boolean active, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.height = height;
        this.weight = weight;
        this.active = active;
        this.dateOfBirth = dateOfBirth;
    }

    public Customer() {
    }

     public   void calculate( ) {
        String y = "Harry";
        name = y;
        
    }
   
     
}
