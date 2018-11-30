package Chap4_Factory.FactoryMethod;

/**
 * Created by Citrix on 2018/11/29.
 */
public abstract class PizzaStore {
    /*
     * 抽象类里面可以定义具有方法，也可以定义抽象方法，具体方法里面也可以有抽象方法
     * */
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
