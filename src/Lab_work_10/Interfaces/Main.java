package Lab_work_10.Interfaces;

public class Main {
    public static void main(String[] args) {
        Person[] mock = new Person[3];
        mock[0] = new Worker("Petr");
        mock[1] = new Student("Gleb");
        mock[2] = new Pensioner("Ivan Kuzmich");
        for (Person person : mock) {
            System.out.println(person.toString());
        }
    }
}
