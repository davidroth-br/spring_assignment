package com.montrealcollege.assignment.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private String email;
    @Autowired
    private Department Department;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Double salary, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public com.montrealcollege.assignment.entities.Department getDepartment() {
        return Department;
    }

    public void setDepartment(com.montrealcollege.assignment.entities.Department department) {
        Department = department;
    }
}
