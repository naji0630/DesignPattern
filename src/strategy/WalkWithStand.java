package strategy;

public class WalkWithStand implements WalkBehavior{
    @Override
    public void walk() {
        System.out.println("뚜벅뚜벅");
    }
}
