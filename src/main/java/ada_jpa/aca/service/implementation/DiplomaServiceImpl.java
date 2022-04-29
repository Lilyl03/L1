package ada_jpa.aca.service.implementation;

import com.aca.entity.Diploma;
import com.aca.entity.User;
import com.aca.repository.DiplomaRepository;
import com.aca.service.core.DiplomaService;
import com.aca.service.core.UserService;
import com.aca.service.core.parameters.CreateDiplomaParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

public class DiplomaServiceImpl implements DiplomaService {
    private final DiplomaRepository diplomaRepository;
    private final UserService userService;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    public DiplomaServiceImpl(DiplomaRepository diplomaRepository, UserService userService) {
        this.diplomaRepository = diplomaRepository;
        this.userService = userService;
    }

    @Override
    public Diploma create(CreateDiplomaParams params) {
        Assert.notNull(params, "The create params should not be null");
        LOGGER.info("Creating a diploma for the provided params - {} ", params);
        User user = userService.getById(params.getUserId());

        Diploma transientDiploma = new Diploma(
                params.getColorType(),
                params.getStartDate(),
                params.getEndDate(),
                user
        );
        final Diploma persistentDiploma = diplomaRepository.save(transientDiploma);

        LOGGER.info("Successfully created a diploma for the provided params - {} ", params);
        return persistentDiploma;
    }
}
