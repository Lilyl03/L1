package com.company.d29;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserServiceImpl implements UserService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(CreateUserParams params) {
        LOGGER.debug("Creating a user for the provided params - {}", params);
        User user = new User(params.getFirstName(), params.getSecondName());
        User save = userRepository.save(user);
        LOGGER.debug("Successfully created a user for the provided params - {}", params);
        return save;

    }
}
