package com.aca.exam.exam3.service.core.params;

public class CreateNumberPlateParams {
    private String numberPlate;
    private String passportId;

    public CreateNumberPlateParams(String numberPlate, String passportId) {
        this.numberPlate = numberPlate;
        this.passportId = passportId;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateNumberPlateParams that = (CreateNumberPlateParams) o;

        if (getNumberPlate() != null ? !getNumberPlate().equals(that.getNumberPlate()) : that.getNumberPlate() != null)
            return false;
        return getPassportId() != null ? getPassportId().equals(that.getPassportId()) : that.getPassportId() == null;
    }

    @Override
    public int hashCode() {
        int result = getNumberPlate() != null ? getNumberPlate().hashCode() : 0;
        result = 31 * result + (getPassportId() != null ? getPassportId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateNumberPlateParams{");
        sb.append("numberPlate='").append(numberPlate).append('\'');
        sb.append(", passportId='").append(passportId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
