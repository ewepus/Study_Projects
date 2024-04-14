package Demo_work_10;

public class Anonymous implements Birthable {
    private String birthDate;

    public Anonymous(String birthDate) {
        this.setBirthDate(birthDate);
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("Empty string");
        }
        this.birthDate = birthDate;
    }
}
