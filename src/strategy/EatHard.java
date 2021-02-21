package strategy;

public class EatHard implements EatBehavior{
    @Override
    public void eat() {
        System.out.println("우걱우걱");
    }
}
