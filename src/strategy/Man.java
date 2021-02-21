package strategy;

class Man extends Person{
    public Man(){
        eatBehavior = new EatHard();
        walkBehavior = new WalkWithStand();
    }

    public void shave(){
        System.out.println("쓱싹쓱싹");
    }
}
