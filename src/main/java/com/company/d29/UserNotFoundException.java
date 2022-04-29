package com.company.d29;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(final String username) {
        super(String.format("User having a username - %s not found", username));
    }
}
