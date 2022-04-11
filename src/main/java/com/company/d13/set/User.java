package com.company.d13.set;

public class User {
    private final String firstname;
    private final String lastname;

    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return user.firstname.equals(this.firstname) && user.lastname.equals(this.lastname);
    }

    @Override
    public String toString() {
        return
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'';
    }
}
