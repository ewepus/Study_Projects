package Lab_work_10.Interfaces;

public class Worker extends BasePerson {
    public Worker(String name) {
        super(name);
    }

    @Override
    public String getEmployment() {
        return "works";
    }

    public String toString() {
        return getName() + " " + getEmployment();
    }
}
