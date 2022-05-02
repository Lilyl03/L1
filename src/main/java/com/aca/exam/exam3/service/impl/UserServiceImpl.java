package com.aca.exam.exam3.service.impl;

import com.aca.exam.exam3.entity.User;
import com.aca.exam.exam3.service.core.UserService;
import com.aca.exam.exam3.service.core.params.CreateUserParams;

import java.sql.Connection;
import java.sql.SQLException;

public class UserServiceImpl implements UserService {
        Connection connection;

    @Override
    public User create(CreateUserParams params) {
        User user = new User(params.getFirstName(), params.getSecondName(), params.getPassportId());
        try {
            connection.createStatement().execute(
                    "Insert into users(first_name, second_name,passport_id) values("+
                            user.getFirstName() + "," +
                            user.getSecondName() + "," +
                            user.getPassportId() + ");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
