package Chap8_Template;

/**
 * Created by Citrix on 2018-12-19.
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWants()) {
            addCondiments();
        }

    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("I am boiling water");
    }

    void pourInCup() {
        System.out.println("I am pouring in cup");
    }
    /*
    * 钩子函数
    * */
    boolean customerWants() {
        return true;
    }
}
