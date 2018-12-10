package Chap7_Adapter_Facade.Adapter;

/**
 * Created by Citrix on 2018/12/10.
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("The Turkey says ...");
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("The Duck says ...");
        testDuck(mallardDuck);
        System.out.println("The TurkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
