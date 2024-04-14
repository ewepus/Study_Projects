package Lab_work_10.Interfaces;

public class Student extends BasePerson {
    public Student(String name) {
        super(name);
    }

    @Override
    public String getEmployment() {
        return "studies";
    }

    public String toString() {
        return getName() + " " + getEmployment();
    }
}
