package com.JPApart2.JPA2.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "employeeTable")
public class Employee {
    @Id
    @Column(name="empId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "empFirstName")
    private String firstName;
    @Column(name = "empLastName")
    private String lastName;
    @Column(name = "empAge")
    private int age;
    @Column(name = "empSalary")
    private double salary;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", Salary=" + salary +
                '}';
    }
}
