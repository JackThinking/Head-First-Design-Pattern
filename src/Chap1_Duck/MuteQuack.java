package Chap1_Duck;

/**
 * Created by Citrix on 2018/11/26.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("嘎不出来");
    }
}
