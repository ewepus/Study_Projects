package Demo_work_10;

public abstract class AbstractPerson implements Person, Birthable, Identifiable {
    protected String name;
    private int age;
    private String id;
    private String birthDate;

    protected AbstractPerson(String name, int age, String id, String birthDate) {

        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDate(birthDate);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    protected void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Empty string");
        }
        this.name = name;
    }

    protected void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Negative integer");
        }
        this.age = age;
    }

    protected void setId(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Empty string");
        }
        this.id = id;
    }

    protected void setBirthDate(String birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("Empty string");
        }
        this.birthDate = birthDate;
    }
}
