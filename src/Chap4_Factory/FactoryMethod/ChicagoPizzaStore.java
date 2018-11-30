package Chap4_Factory.FactoryMethod;

/**
 * Created by Citrix on 2018/11/29.
 */
public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
