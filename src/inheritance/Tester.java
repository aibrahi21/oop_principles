package inheritance;

public class Tester extends Person{
   //Default constructor
    public Tester(){

    }

    public Tester(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void tests(){
        System.out.println("Tester tests");
    }
}
