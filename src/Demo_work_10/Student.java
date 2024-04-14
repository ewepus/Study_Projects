package Demo_work_10;

public class Student extends AbstractPerson implements IdentifiableStudent {
    private String studentId;

    public Student(String name, int age, String id, String studentId, String birthDate) {
        super(name, age, id, birthDate);
        this.setStudentId(studentId);
    }
    @Override
    public String getName() {
        return this.getClass().getSimpleName() + ": " + super.getName();
    }

    @Override
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null) {
            throw new IllegalArgumentException("Empty string");
        }
        this.studentId = studentId;
    }
}
