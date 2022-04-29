package com.company.d29;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Optional;

public class UserServiceImpl implements UserService{


    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(CreateUserParams params) {
        Assert.notNull(params,"Params must not be null");
        LOGGER.info("Creating a user for the provided params - {}", params);
        User user = new User(
                params.getUsername(),
                params.getFirstName(),
                params.getSecondName());
        User save = userRepository.save(user);
        LOGGER.info("Successfully created a user for the provided params - {}", params);
        return save;

    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userRepository=" + userRepository +
                '}';
    }

    @Override
    public User getByUserName(String username) {
        LOGGER.info("Retrieving user for the provided username{}", username);
        Assert.hasText(username, "The username should not bew null or empty");
        //User user = userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException(username));
        Optional<User> byUsername = userRepository.findByUsername(username);
        if(byUsername.isEmpty())
        {
           throw new UserNotFoundException(username);
        }
        User user = byUsername.get();
        LOGGER.info("Successfully retrieved user for the provided username{}, result {}", username,user);
        return user;
    }
}
