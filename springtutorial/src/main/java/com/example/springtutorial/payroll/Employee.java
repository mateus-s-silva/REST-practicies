package com.example.springtutorial.payroll;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String role;

    public Employee(String firstName, String lastName, String role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public Employee(){}

    public Long getId() {
        return this.id;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getRole(){
        return this.role;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setRole(String role){
        this.role = role;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(!(obj instanceof Employee)) return false;

        Employee employee = (Employee) obj;

        return Objects.equals(this.id, employee.id)
                && Objects.equals(this.firstName, employee.firstName)
                && Objects.equals(this.lastName, employee.lastName)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.role);
    }

    public String toString(){
        return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName
                + '\'' + ", role='" + this.role + '\'' + '}';
    }
}