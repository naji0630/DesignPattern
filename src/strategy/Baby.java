package strategy;

public class Baby extends Person{
    public Baby(){
        eatBehavior = new EatCute();
        walkBehavior = new WalkWithNoStand();
    }
}
