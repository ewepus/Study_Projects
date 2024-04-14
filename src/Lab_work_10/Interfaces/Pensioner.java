package Lab_work_10.Interfaces;

public class Pensioner extends BasePerson {
    public Pensioner(String name) {
        super(name);
    }

    @Override
    public String getEmployment() {
        return "rests";
    }

    public String toString() {
        return getName() + " " + getEmployment();
    }
}
