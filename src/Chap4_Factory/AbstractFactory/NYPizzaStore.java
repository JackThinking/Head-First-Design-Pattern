package Chap4_Factory.AbstractFactory;

/**
 * Created by Citrix on 2018/11/30.
 */
public class NYPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
