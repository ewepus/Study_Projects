package Demo_work_11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class PersonMain {
    static String path = "resources\\person.objects";
    static String[] temp;
    static Person[] persons = {
            new Person("Фёдоров", "Фёдор", "Фёдорович", 1995, "man"),
            new Person("Антонова", "Антонина", "Антоновна", 2008, "woman"),
            new Person("Сидоров", "Сидор", "Сидорович", 1971, "man"),
            new Person("Александрова", "Александра", "Александровна", 2001, "woman"),
            new Person("Иванов", "Иван", "Иванович", 1971, "man")
    };

    static void writePersons() {
        try (FileWriter writer = new FileWriter(path, false)) {
            for (Person human : persons) {
                writer.write(human.toString());
                writer.write(System.lineSeparator());
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static Person[] readPersons() {
        Person[] people = null;
        int count = 0;
        if (Files.exists(Paths.get(path))) {
            try {
                count = (int) Files.lines(Paths.get(path)).count();
                people = new Person[count];
            } catch (IOException e) {
                System.out.println("Exception " + e.getMessage());
            }
        }

        try (FileReader reader = new FileReader(path)) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                temp = scanner.nextLine().split(" ");
                people[--count] = new Person(temp[0], temp[1], temp[2], Integer.parseInt(temp[3]), temp[4]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Wrong path " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception " + e.getMessage());
        }
        return people;
    }

    public static boolean save(Person[] persons) {
        try(ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream(path))) {
            out.writeObject(persons);
            out.flush();
            return true;
        } catch (IOException exception) {
            System.out.println("Exception " + exception.getClass() + " in " + exception.getMessage());
        }
        return false;
    }

    public static void reload() {
        if (Files.exists(Paths.get(path))) {
            try(ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(path))) {
                Person[] persons = (Person[]) in.readObject();
                for (Person human : persons) {
                    System.out.println(human.toGenderString());
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Считанные данные оказались иного формата: " + e.getMessage());
            } catch (FileNotFoundException e) {
                System.out.println("There is no file at such path: " + path);
            } catch (IOException e) {
                System.out.println("Something's wrong: " + e.getMessage());
            }
        } else System.out.println("There is no file at such path: " + path);
    }

    public static void main(String[] args) {
        /*writePersons();
        readPersons();
        for (Person man : persons) {
            System.out.println(man);
        }*/
        save(persons);
        reload();
    }
}
