package Demo_work_10;
public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = new Citizen("Bob", 31, "123", "30-10-1993");
        objects[1] = new Student("Tom", 19, "124", "31-12-2005", "100500");
        objects[2] = new Student("Ann", 20, "125", "31-02-2004", "100501");
        objects[3] = new Citizen("Tim", 84, "123", "13-01-1940");
        objects[4] = new Anonymous("31-12-2000");

        int citizenCount = 0, studentCount = 0, anonymousCount = 0;

        for (Object item : objects) {
            if (item instanceof Person) {
                System.out.println(((Person) item).getName());
                if (item instanceof Citizen) citizenCount++;
                else studentCount++;
            } else anonymousCount++;
        }
        System.out.println("Citizen count: " + citizenCount);
        System.out.println("Student count: " + studentCount);
        System.out.println("Anonymous count: " + anonymousCount);
    }
}
