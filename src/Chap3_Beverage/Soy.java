package Chap3_Beverage;

/**
 * Created by Citrix on 2018/11/28.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;//与被修饰者共同的祖类

    /*
     * 指向构造函数中的祖类的子类对象
     * */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
