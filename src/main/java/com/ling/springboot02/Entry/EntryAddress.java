package com.ling.springboot02.Entry;

import org.springframework.stereotype.Component;

import java.util.Objects;

public class EntryAddress {
    private String country;
    private String city;

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
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EntryAddress)) return false;
        EntryAddress address = (EntryAddress) o;
        return Objects.equals(getCountry(), address.getCountry()) &&
                Objects.equals(getCity(), address.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry(), getCity());
    }
}
