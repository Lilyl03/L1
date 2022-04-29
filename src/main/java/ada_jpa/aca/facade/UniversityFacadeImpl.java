package ada_jpa.aca.facade;

import com.aca.entity.User;
import com.aca.service.core.DiplomaService;
import com.aca.service.core.UserService;
import com.aca.service.core.parameters.CreateUserParams;
import com.aca.service.implementation.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UniversityFacadeImpl implements UniversityFacade{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);


    public UniversityFacadeImpl(UserService userService,DiplomaService diplomaService) {
        this.userService = userService;
        this.diplomaService = diplomaService;

    }

    private final UserService userService;
    private final DiplomaService diplomaService;



    @Override
    public UserAdmissionResponseDto admit(UserAdmissionRequestDto dto) {
        LOGGER.info("Admitting a student for the provided request - {}", dto);
        User user = userService.create(new CreateUserParams(dto.getFirstName() + "_" + dto.getSecondName(), dto.getFirstName(), dto.getSecondName()));

        return new UserAdmissionResponseDto(user.getUsername(), user.getFirstName(),user.getSecondName());
    }
}
