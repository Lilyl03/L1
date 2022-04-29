package ada_jpa.aca.service.implementation;

import com.aca.entity.User;
import com.aca.repository.UserRepository;
import com.aca.service.core.UserService;
import com.aca.service.core.parameters.CreateUserParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.Optional;

public class UserServiceImpl implements UserService {


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

    @Override
    public User getById(Long id) {
        Assert.notNull(id, "The id should not be null");
        LOGGER.info("Retrieving user for the provided id{}", id);
        //User user = userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException(username));
        Optional<User> byId = userRepository.findById(id);
        if(byId.isEmpty())
        {
            throw new UserNotFoundException(id);
        }
        User user = byId.get();
        LOGGER.info("Successfully retrieved user for the provided id{}, result {}", id,user);
        return user;
    }
}
