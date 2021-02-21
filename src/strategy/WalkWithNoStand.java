package strategy;

public class WalkWithNoStand implements WalkBehavior{
    @Override
    public void walk() {
        System.out.println("아장아장");
    }
}
