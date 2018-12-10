package Chap7_Adapter_Facade.Adapter;

/**
 * Created by Citrix on 2018/12/10.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎");
    }

    @Override
    public void fly() {
        System.out.println("我在飞哦");
    }
}
