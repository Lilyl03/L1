package com.company.d14.anonymous;

public class Main {
    public static void main(String[] args) {
        User user1 = new UserImpl("Name", 15);
        User user2 = User.of("Name", 15);
        User user = new User() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getAge() {
                return 0;
            }
        };
    }
}
