package ada_jpa.aca.facade;

public class UserAdmissionResponseDto {
    private final String username;
    private final String firstName;
    private final String secondName;

    public UserAdmissionResponseDto(String username, String firstName, String secondName) {
        this.username = username;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
