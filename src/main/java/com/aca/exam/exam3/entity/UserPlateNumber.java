package com.aca.exam.exam3.entity;

import javax.persistence.*;

@Entity
@Table(name = "USERPLATENUMBERS")
public class UserPlateNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "passport_id",nullable = false)
    private String passportId;

    @Column(name = "number_plate",nullable = false)
    private String numberPlate;

    @ManyToOne
    @JoinColumn(name = "user_id",  foreignKey = @ForeignKey(name = "FK_DIPLOMA_USER_ID_ID"))
    private User user;

    @OneToOne
    @JoinColumn(name = "numberplate_id",  foreignKey = @ForeignKey(name = "FK_DIPLOMA_USER_ID_ID"))
    private NumberPlate plate;

    public UserPlateNumber(String passportId, String numberPlate) {
        this.passportId = passportId;
        this.numberPlate = numberPlate;
    }

    public Long getId() {
        return id;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public NumberPlate getPlate() {
        return plate;
    }

    public void setPlate(NumberPlate plate) {
        this.plate = plate;
    }
}
