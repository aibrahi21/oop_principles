package inheritance;

public class Singer extends Person{
    //Default
    public Singer(){

    }

    public Singer(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void sings(){
        System.out.println("Singer sings");
    }
}
