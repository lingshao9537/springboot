package com.ling.springboot02.Entry;

import com.ling.springboot02.dao.bean.Address;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class EntryPerson {
    private String name;
    private int age;
    private double height;
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntryPerson)) return false;
        EntryPerson person = (EntryPerson) o;
        return getAge() == person.getAge() &&
                Double.compare(person.getHeight(), getHeight()) == 0 &&
                Objects.equals(getName(), person.getName()) &&
                Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHeight(), getAddress());
    }
}
