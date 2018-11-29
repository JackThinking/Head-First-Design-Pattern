package Chap4_Factory;

/**
 * Created by Citrix on 2018/11/29.
 */
public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
