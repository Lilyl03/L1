package com.aca.exam.exam3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "NUMBERPLATES")
public class NumberPlate {

    @Column(name = "number_plate",nullable = false)
    private String numberPlate;

    public NumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
