package strategy;

public class main {
    public static void main(String[] args) {
        Person man = new Man();
        Person woman = new Woman();
        Person baby = new Baby();
        System.out.println("남자가 밥을 먹는다.");
        man.performEat();
        System.out.println("남자가 걷는다.");
        man.performWalk();

        System.out.println("여자가 밥을먹는다.");
        woman.performEat();
        System.out.println("여자가 걷는다.");
        woman.performWalk();

        System.out.println("아기가 밥을 먹는다.");
        baby.performEat();
        System.out.println("아기가 걷는다.");
        baby.performWalk();

        man.isDrunken = true;

        if(man.isDrunken){
            man.setWalkBehavior(new WalkWithNoStand());
        }

        man.performWalk();
    }
}
