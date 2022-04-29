package ada_jpa.aca.service.implementation;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(final String username) {
        super(String.format("User having a username - %s not found", username));
    }

    public UserNotFoundException(Long id) {
        super(String.format("User having a id - %s not found", id));
    }
}
