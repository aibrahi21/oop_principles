package inheritance;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        /*
        Give a fName, lName, age, gender, DOB, and SSN to all the objects below
        Person1 : John Doe, 45, Male, 01/01/1977, 000-00-0000
        Tester1 : Abe Kim, 20, Male, 01/12/2002, 111-11-1111
        Singer1 : Kaly Ngo, 15, Female, 05/10/2007, 222-22-2222
        Dancer1 : Alona Q, 15, Female, 10/10/2007, 333-33-3333
         */

        Person person1 = new Person();
        Tester tester1 = new Tester();
        Dancer dancer1 = new Dancer();
        Singer singer1 = new Singer();

        person1.fName = "John";
        person1.lName = "Doe";
        person1.age = 45;
        person1.gender = "Male";
        person1.setDOB("01/01/1997");
        person1.setSSN("000-00-0000");

        tester1.fName = "Abe";
        tester1.lName = "Kim";
        tester1.age = 20;
        tester1.gender = "Male";
        tester1.setDOB("01/12/2002");
        tester1.setSSN("111-11-1111");

        singer1.fName = "Kaly";
        singer1.lName = "Ngo";
        singer1.age = 15;
        singer1.gender = "Female";
        singer1.setDOB("05/10/2007");
        singer1.setSSN("222-22-2222");

        dancer1.fName = "Alona";
        dancer1.lName = "Q";
        dancer1.age = 15;
        dancer1.gender = "Female";
        dancer1.setDOB("10/10/2007");
        dancer1.setSSN("333-33-3333");

        /*
        Give a fName, lName, age, gender, DOB and SSN to all the objects below

        Person 2: Jane Doe, 45, Female, 01/01/1977, 555-55-5555
        Tester 2: Yung Kim, 20, Male, 01/12/2002, 777-77-7777
        Singer 2: Jessie J, 15, Female, 05/10/2007, 666-66-6666
        Dancer 2: B Q, 15, Female, 10/10/2007, 999-99-9999
         */
        Person person2 = new Person("Jane", "Doe", 45, "Female");
        person2.setDOB("555-55-5555");
        person2.setSSN("01/01/1977");
        Tester tester2 = new Tester("Yung", "Kim", 20, "Male");
        tester2.setDOB("777-77-7777");
        tester2.setSSN("01/12/2002");
        Singer singer2 = new Singer("Jessie", "J", 15, "Female");
        singer2.setDOB("666-66-6666");
        singer2.setSSN("05/10/2007");
        Dancer dancer2 = new Dancer("B", "Q", 15, "Female");
        dancer2.setDOB("999-99-9999");
        dancer2.setSSN("10/10/2007");

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(tester2);
        personList.add(singer2);
        personList.add(dancer2);

       // personList.forEach(element -> System.out.println(element));

        Person[] personArr = {person2,singer2,tester2,dancer2};

        for (Person person : personArr) {
            System.out.println(person);
        }
    }
}