package Chap8_Template;

/**
 * Created by Citrix on 2018-12-19.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("adding lenmon");
    }
}
