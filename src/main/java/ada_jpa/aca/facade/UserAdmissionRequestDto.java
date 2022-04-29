package ada_jpa.aca.facade;

public class UserAdmissionRequestDto {

    private final String firstName;
    private final String secondName;

    public UserAdmissionRequestDto(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
