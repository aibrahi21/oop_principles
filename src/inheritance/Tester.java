package inheritance;

public class Tester extends Person{
   //Default constructor
    public Tester(){

    }

    public Tester(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }

    public void code(){
        System.out.println("Tester codes");
    }
   /* @Override // not necessary, but better to put before every override
    public void eat(){
        System.out.println("Tester eats");
    }
    public void sleep(){
        System.out.println("Tester sleeps");
    }
    public void walk(){
        System.out.println("Tester walks");
    }
    public void learn(){
        System.out.println("Tester learns");
    }
    */
    //Did with right-click -> generate -> override methods -> selected all of them
    @Override
    public void sleep() {
        System.out.println("Tester sleeps");
    }

    @Override
    public void learn() {
        System.out.println("Tester learns");
    }

    @Override
    public void walk() {
        System.out.println("Tester walks");
    }

    @Override
    public void eat() {
        System.out.println("Tester eats");
    }
}
