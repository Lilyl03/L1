package com.aca.exam.exam3.service.impl;

import com.aca.exam.exam3.entity.UserPlateNumber;
import com.aca.exam.exam3.service.core.UserPlateNumberService;
import com.aca.exam.exam3.service.core.params.CreateUserPlateNumberParams;

import java.sql.Connection;
import java.sql.SQLException;

public class UserPlateNumberServiceImpl implements UserPlateNumberService {
        Connection connection;

    @Override
    public UserPlateNumber create(CreateUserPlateNumberParams params) {
        UserPlateNumber userPlateNumber = new UserPlateNumber(params.getPassportId(), params.getPlateNumber());
        try {
            connection.createStatement().execute("Insert into users(plate_number,passport_id) values("+
                    userPlateNumber.getNumberPlate() + "," +
                    userPlateNumber.getPassportId() + ");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userPlateNumber;
    }
}
