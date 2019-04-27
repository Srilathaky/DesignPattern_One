package test;

public class Main {
    public static void main(String[] args) {
        Duck mallard=new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();

        Duck rubberduck=new RubberDuck();
        rubberduck.display();
        rubberduck.performFly();
        rubberduck.performQuack();
        //To change the Flying Behavior dynamically we can use setFlyBehavior in Duck class
        rubberduck.setFlyBehavior(new FlyRocketPowered());
        rubberduck.performFly();
    }
}
