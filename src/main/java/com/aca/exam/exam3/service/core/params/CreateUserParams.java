package com.aca.exam.exam3.service.core.params;

public class CreateUserParams {
    private final String firstName;
    private final String secondName;
    private final String passportId;

    public CreateUserParams(String firstName, String secondName, String passportId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.passportId = passportId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPassportId() {
        return passportId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateUserParams{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", passportId='").append(passportId).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateUserParams that = (CreateUserParams) o;

        if (getFirstName() != null ? !getFirstName().equals(that.getFirstName()) : that.getFirstName() != null)
            return false;
        if (getSecondName() != null ? !getSecondName().equals(that.getSecondName()) : that.getSecondName() != null)
            return false;
        return getPassportId() != null ? getPassportId().equals(that.getPassportId()) : that.getPassportId() == null;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getSecondName() != null ? getSecondName().hashCode() : 0);
        result = 31 * result + (getPassportId() != null ? getPassportId().hashCode() : 0);
        return result;
    }
}
