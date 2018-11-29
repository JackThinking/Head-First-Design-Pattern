package Chap4_Factory;

/**
 * Created by Citrix on 2018/11/29.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        /*
        * 创建实例的时候，只有new出来工厂，并没有new实际披萨对象，使用工厂的参数再生产具体的对象
        * */
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Jack ordered a " + pizza.getName() + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Citrix ordered a " + pizza.getName() + "\n");
    }
}
