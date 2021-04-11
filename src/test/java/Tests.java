import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tests {

    Person p1 = new Person("P1", LocalDate.parse("1991-01-01"), Person.Sex.MALE, "p1@zip.com");
    Person p2 = new Person("P2", LocalDate.parse("1992-01-01"), Person.Sex.MALE, "p2@zip.com");
    Person p3 = new Person("P3", LocalDate.parse("1990-01-01"), Person.Sex.MALE, "p3@zip.com");
    Person p4 = new Person("P4", LocalDate.parse("1980-01-01"), Person.Sex.MALE, "p4@zip.com");
    Person p5 = new Person("P5", LocalDate.parse("1993-01-01"), Person.Sex.MALE, "p5@zip.com");
    List<Person> personList = new ArrayList<>();


    @Test
    public void testLocalClass1(){
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        Local.printPersonsOlderThan(personList, 31);
    }
    @Test
    public void testLocalClass2(){
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        Local.printPersonsOlderThan(personList, 30);
    }
    @Test
    public void testAnonymousClass1(){
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        Anonymous.printPersonsWithinAgeRange(personList, 29, 33);
    }

    @Test
    public void testAnonymousClass2(){
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        Anonymous.printPersonsWithinAgeRange(personList, 25, 30);
    }

    @Test
    public void lambdaTest(){
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);

        List<Person> filteredList = (List<Person>) personList.stream()
                .filter(i -> 25 <= i.getAge() && i.getAge() >= 40)
                .collect(Collectors.toList());
        for(Person p: filteredList){
            p.printPerson();
        }
    }

}
