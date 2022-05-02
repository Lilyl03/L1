package com.aca.exam.exam3.service.core.params;


public class CreateUserPlateNumberParams {
    private final String plateNumber;
    private final String passportId;

    public CreateUserPlateNumberParams(String plateNumber, String passportId) {
        this.plateNumber = plateNumber;
        this.passportId = passportId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getPassportId() {
        return passportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateUserPlateNumberParams that = (CreateUserPlateNumberParams) o;

        if (getPlateNumber() != null ? !getPlateNumber().equals(that.getPlateNumber()) : that.getPlateNumber() != null)
            return false;
        return getPassportId() != null ? getPassportId().equals(that.getPassportId()) : that.getPassportId() == null;
    }

    @Override
    public int hashCode() {
        int result = getPlateNumber() != null ? getPlateNumber().hashCode() : 0;
        result = 31 * result + (getPassportId() != null ? getPassportId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateUserPlateNumberParams{");
        sb.append("plateNumber='").append(plateNumber).append('\'');
        sb.append(", passportId='").append(passportId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
