package Chap4_Factory.AbstractFactory;

import Chap4_Factory.AbstractFactory.Ingredient.*;

/**
 * Created by Citrix on 2018/11/30.
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Pepperoni createPepperoni();

    public Clams createClam();

}
