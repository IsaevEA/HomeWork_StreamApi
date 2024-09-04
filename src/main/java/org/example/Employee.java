package org.example;


import java.util.UUID;

public class Employee {
    private UUID id;
    private int age;
    private Telephone telephone;

    public Employee() {
    }

    public Employee(UUID id, int age, Telephone telephone) {
        this.id = id;
        this.age = age;
        this.telephone = telephone;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", telephone=" + telephone +
                '}';
    }
}
