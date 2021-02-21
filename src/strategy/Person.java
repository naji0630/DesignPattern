package strategy;

public abstract class Person {

    EatBehavior eatBehavior;
    WalkBehavior walkBehavior;
    boolean isDrunken;

    public void setEatBehavior(EatBehavior eatBehavior) {
        this.eatBehavior = eatBehavior;
    }

    public void setWalkBehavior(WalkBehavior walkBehavior) {
        this.walkBehavior = walkBehavior;
    }

    public void breath(){
        System.out.printf("입과 코로 후하");
    }

    public void performEat(){
        eatBehavior.eat();
    }

    public void performWalk(){
        walkBehavior.walk();
    }
}


