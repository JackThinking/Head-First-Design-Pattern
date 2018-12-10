package Chap7_Adapter_Facade.Adapter;

/**
 * Created by Citrix on 2018/12/10.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("呀呀呀");
    }

    @Override
    public void fly() {
        System.out.println("我只能短短的飞");
    }
}
