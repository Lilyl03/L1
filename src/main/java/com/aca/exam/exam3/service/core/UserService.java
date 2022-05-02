package com.aca.exam.exam3.service.core;

import com.aca.exam.exam3.entity.User;
import com.aca.exam.exam3.service.core.params.CreateUserParams;

public interface UserService {
    User create(CreateUserParams params);
}
