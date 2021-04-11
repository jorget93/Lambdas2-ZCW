import java.time.LocalDate;

public class Person {

    public enum Sex{
        MALE, FEMALE;
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        int age = 2021 - birthday.getYear();
        return age;
    }

    public void printPerson(){
        System.out.println("Name: " + name + ", Age: " + getAge());
    }
}
