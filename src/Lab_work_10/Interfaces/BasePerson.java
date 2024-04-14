package Lab_work_10.Interfaces;

public abstract class BasePerson implements Person {
    private String name;

    public BasePerson(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Exception: empty string");
        }
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract String getEmployment();
}
