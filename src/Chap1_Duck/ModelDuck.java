package Chap1_Duck;

/**
 * Created by Citrix on 2018/11/26.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("我是一只模型鸭");
    }
}
