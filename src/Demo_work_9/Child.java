package Demo_work_9;

public class Child extends Person {
    public Child(String name, int age) throws Exception {
        super(name, age);
        setActivity();
    }

    @Override
    protected void setAge(int age) throws Exception {
        if (age > 15) {
            throw new Exception("Child's age must be less than 15!");
        }
        super.setAge(age);
    }
    protected void setActivity() {
        this.activity = "school";
    }
}
