package com.company.d29;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
//        User user = new User();
//        user.setId(1L);
//        user.setFirstName("First Name");
//        user.setSecondName("Second Name");
//        userRepository.save(user);
//        userRepository.save(new User("First Name", "Second Name"));
        UserService userService = new UserServiceImpl(userRepository);
        for (int i = 0; i < 100; i++) {
            userService.create(new CreateUserParams(
                    "username" + i,
                    "first " + i,
                    "second " + i));
        }
        System.out.println(userService.getByUserName("username1"));
    }
}
