package Demo_work_9;

public class Person {
    protected String name;
    protected int age;
    protected String activity = "work";

    public Person(String name, int age) throws Exception {
        this.setName(name);
        this.setAge(age);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age + ", every day goes to: " + activity;
    }

    protected void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new NullPointerException();
        }
        this.name = name;
    }

    protected void setAge(int age) throws Exception {
        if (age < 1) {
            throw new Exception("Age must be positive!");
        }
        this.age = age;
    }
}
