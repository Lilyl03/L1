package com.company.d20.map;

import java.util.Objects;

public class User {
    private final String username;
    private final int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }


    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (getAge() != user.getAge()) return false;
        return getUsername() != null ? getUsername().equals(user.getUsername()) : user.getUsername() == null;
    }

    @Override
    public int hashCode() {
//        int result = getUsername() != null ? getUsername().hashCode() : 0;
//        result = 31 * result + getAge();
//        return result;
        return Objects.hash(username,age);
    }
}
