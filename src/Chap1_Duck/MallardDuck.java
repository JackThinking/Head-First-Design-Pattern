package Chap1_Duck;

/**
 * Created by Citrix on 2018/11/26.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        /*
        * 构造函数里面是实际的类的对象
        * */
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("我是一只绿头鸭子");
    }
}
