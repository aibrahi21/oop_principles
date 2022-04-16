package inheritance;

public class Dancer extends Person{
    //Default
    public Dancer(){

    }

    public Dancer(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void dances(){
        System.out.println("Dancer dances");
    }
}
