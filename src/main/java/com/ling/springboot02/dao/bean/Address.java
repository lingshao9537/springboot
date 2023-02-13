package com.ling.springboot02.dao.bean;

import org.springframework.stereotype.Component;

import java.util.Objects;

public class Address {
    private int addressid;
    private String country;
    private String city;

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressid=" + addressid +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
