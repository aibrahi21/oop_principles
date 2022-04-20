package abstraction.abstraction_classes;

public class Nokia extends Phone{
    @Override
    public void call() {
        System.out.println("Nokia calls");
    }

    @Override
    public void ring() {
        System.out.println("Nokia rings");
    }

    @Override
    public void text() {
        System.out.println("Nokia texts");
    }
}
