package com.company.d24;

import com.company.d14.anonymous.User;
import com.company.d14.anonymous.UserImpl;

import java.util.function.Function;

public interface UserMapper extends Function<User, UserImpl> {
//    public static void main(String[] args) {
//        UserMapper userMapper = null;
//        UserImpl apply = userMapper.apply(new User("Test") )
//    }
}
