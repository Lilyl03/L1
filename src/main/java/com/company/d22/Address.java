package com.company.d22;

import java.io.Serializable;

public class Address implements Serializable {
    private String country;
    private int number;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("country='").append(country).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
