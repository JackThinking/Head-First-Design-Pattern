package Chap4_Factory.AbstractFactory;

import Chap4_Factory.AbstractFactory.Ingredient.*;

/**
 * Created by Citrix on 2018/11/30.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes");
    }

    void cut() {
        System.out.println("Cutting the pizza into slice");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        System.out.println("To be continue...");
        return "To be continue...";
    }
}
