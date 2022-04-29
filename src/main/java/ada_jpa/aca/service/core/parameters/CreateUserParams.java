package ada_jpa.aca.service.core.parameters;

import org.springframework.util.Assert;

import java.util.Objects;

public class CreateUserParams {
    private final String firstName;
    private final String secondName;
    private final String username;

    @Override
    public String toString() {
        return "CreateUserParams{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public CreateUserParams(String username, String firstName, String secondName) {
        Assert.hasText(firstName,"The first name should not be null");
        Assert.hasText(secondName,"The second name should not be null");
        Assert.hasText(username,"The username should not be null");
        this.firstName = firstName;
        this.secondName = secondName;
        this.username = username;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateUserParams that = (CreateUserParams) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(secondName, that.secondName) && Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, username);
    }
}
