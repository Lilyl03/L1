package ada_jpa.aca;

import com.aca.entity.Diploma;
import com.aca.entity.DiplomaColorType;
import com.aca.entity.User;
import com.aca.facade.UniversityFacade;
import com.aca.facade.UniversityFacadeImpl;
import com.aca.repository.DiplomaRepository;
import com.aca.repository.UserRepository;
import com.aca.service.core.DiplomaService;
import com.aca.service.core.UserService;
import com.aca.service.core.parameters.CreateDiplomaParams;
import com.aca.service.core.parameters.CreateUserParams;
import com.aca.service.implementation.DiplomaServiceImpl;
import com.aca.service.implementation.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;

@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class Main {
//    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
//        UserRepository userRepository = context.getBean(UserRepository.class);
//        User user = new User("First Name", "Second Name");
//        user.setId(1L);
//        user.setFirstName("First Name");
//        user.setSecondName("Second Name");
//        userRepository.save(user);
//        userRepository.save(new User("First Name", "Second Name"));
//        UserService userService = new UserServiceImpl(userRepository);
//        for (int i = 0; i < 100; i++) {
//            userService.create(new CreateUserParams(
//                    "username" + i,
//                    "first " + i,
//                    "second " + i));
//        }
//        System.out.println(userService.getByUserName("username1"));
//
//    }
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        DiplomaRepository diplomaRepository = context.getBean(DiplomaRepository.class);

        UniversityFacade universityFacade = new UniversityFacadeImpl(
                new UserServiceImpl(userRepository),
                new DiplomaServiceImpl(
                        diplomaRepository,
                        new UserServiceImpl(userRepository)));

//        final User transientUser = new User("aca", "ACA", "ACADEMY");
//        final User persistentUser = userRepository.save(transientUser);
//        diplomaRepository.save(
//                new Diploma(
//                        DiplomaColorType.RED,
//                        LocalDate.of(2018,9,1),
//                        LocalDate.of(2022,4,28),
//                        transientUser
//        ));
        
        UserService userService = new UserServiceImpl(userRepository);
        
        DiplomaService diplomaService = new DiplomaServiceImpl(diplomaRepository, new UserServiceImpl(userRepository));

        User user = userService.create(new CreateUserParams("arm", "Armen", "Gasparyan"));
        Diploma diploma = diplomaService.create(
                new CreateDiplomaParams(
                        DiplomaColorType.RED,
                        LocalDate.of(2022, 4, 28),
                        LocalDate.of(2018, 9, 1),
                        user.getId()
                )
        );
        
    }
}
