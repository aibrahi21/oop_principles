package abstraction.abstraction_classes;

public class Samsung extends Phone{
    public static final String OS = "Android";
    public Samsung() {
    }

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    public void call() {
        System.out.println("Samsung calls");
    }


    public void ring() {
        System.out.println("Samsung rings");
    }


    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public boolean isConvertible() {
        return false;
    }
}
