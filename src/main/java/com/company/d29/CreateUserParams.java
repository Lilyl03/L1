package com.company.d29;

public class CreateUserParams {
    private final String firstName;
    private final String secondName;

    public CreateUserParams(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }
}
