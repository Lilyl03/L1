package ada_jpa.aca.service.core;

import com.aca.entity.User;
import com.aca.service.core.parameters.CreateUserParams;

public interface UserService  {
    User create(CreateUserParams params);
    User getByUserName(String username);
    User getById(Long id);
}
