package com.company.d29;

public interface UserService  {
    User create(CreateUserParams params);
    User getByUserName(String username);
}
