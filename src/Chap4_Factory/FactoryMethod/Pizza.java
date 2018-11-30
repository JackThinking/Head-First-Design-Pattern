package Chap4_Factory.FactoryMethod;

import java.util.ArrayList;

/**
 * Created by Citrix on 2018/11/29.
 */
public abstract class Pizza {
    public String getName() {
        return name;
    }

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Prepareing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes");
    }
    void cut(){
        System.out.println("Cutting the pizza into slice");
    }
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

}
