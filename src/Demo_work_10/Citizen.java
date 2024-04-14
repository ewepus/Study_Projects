package Demo_work_10;

public class Citizen extends AbstractPerson {
    public Citizen(String name, int age, String id, String birthDate) {
        super(name, age, id, birthDate);
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName() + ": " + super.getName();
    }
}
