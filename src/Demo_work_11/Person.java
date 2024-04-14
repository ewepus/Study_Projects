package Demo_work_11;

import java.io.Serializable;

public class Person implements Serializable {
    private String surname;
    private String name;
    private String patronymic;
    private int year;
    private Gender gender;

    public Person(String surname, String name, String patronymic, int year, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
        this.gender = new Gender(gender);
    }
    public String toGenderString() {
        if (String.valueOf(gender.getGender()).equals("man")) {
            return String.format("Уважаемый %s %s!", surname, name);
        }
        return String.format("Уважаемая %s %s!", surname, name);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %s", surname, name, patronymic, year, gender.getGender());
    }

    class Gender implements Serializable {
        private static final String MALE = "man";
        private static final String FEMALE = "woman";
        private String gender = MALE;

        public Gender(String gender) {
            if (gender != null
                    && gender instanceof String
                    && (gender.equalsIgnoreCase(MALE)
                    || gender.equalsIgnoreCase(FEMALE))) {
                this.gender = gender;
            }
        }

        public String getGender() {
            return gender;
        }
    }
}
