package Chap4_Factory.FactoryMethod;

/**
 * Created by Citrix on 2018/11/29.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish and Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Tomato Sauce";
        toppings.add("Mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slice");
    }
}
