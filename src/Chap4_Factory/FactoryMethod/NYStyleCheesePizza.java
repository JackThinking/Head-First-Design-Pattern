package Chap4_Factory.FactoryMethod;

/**
 * Created by Citrix on 2018/11/29.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Cheese");
    }
}
