package strategy;

class Woman extends Person{
    public Woman(){
        eatBehavior = new EatHard();
        walkBehavior = new WalkWithStand();
    }
    public void makeup(){
        System.out.println("립스틱 바르고 마스카라하고");
    }
}
