package Chap1_Duck;

/**
 * Created by Citrix on 2018/11/26.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("我没有翅膀怎么飞呀");
    }
}
