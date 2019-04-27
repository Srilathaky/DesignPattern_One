package test;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a mallard Duck");
    }
}
