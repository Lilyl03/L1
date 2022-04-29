package com.company.d29;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        Optional<User> user = getUser();
        user.map(User::getFirstName).ifPresent(System.out::println);
//        Optional<String> optional = user.map(User::getFirstName);
    }
    public static Optional<User> getUser(){
        return Optional.of(new User("u","f","s"));
        //return Optional.ofNullable(null);
    }

}
