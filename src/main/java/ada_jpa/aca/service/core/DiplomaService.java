package ada_jpa.aca.service.core;

import com.aca.entity.Diploma;
import com.aca.service.core.parameters.CreateDiplomaParams;

public interface DiplomaService {
    Diploma create(CreateDiplomaParams params);
}
