package Chap3_Beverage;

/**
 * Created by Citrix on 2018/11/28.
 */
public class StarbuzzCoffee {


    public static void main(String[] args) {
        Beverage beverage = new Espresso();//向下转型
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);//用mocha装饰，拿原对象做底建立了新对象
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }
}
