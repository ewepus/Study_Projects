package Lab_work_8;

public class Sheep {
    private final String name;
    private final String gender;
    private int age;

    public Sheep(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    private int getProductivity() {
        if (age < 1) {
            return 0;
        }
        if (gender.equals("female")) {
            return 8;
        }
        if (gender.equals("male")) {
            return 14;
        }
        return -1;
    }

    public void addOneYear() {
        this.age++;
    }

    public String getInfo() {
        int productivity = getProductivity();
        if (productivity != 0) {
            return "Sheep " + name + " gives " + productivity + " kg of wool per cut";
        }
        return "Sheep under 1 year old are not sheared";
    }
}
//var_4