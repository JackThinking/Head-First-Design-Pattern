package Chap4_Factory.AbstractFactory;

/**
 * Created by Citrix on 2018/11/30.
 */
public class PizzaTestAbstactFactory {
    public static void main(String[] args) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        PizzaStore nypizzaStore = new NYPizzaStore();
        Pizza pizza;
        pizza = nypizzaStore.orderPizza("cheese");
    }
}
