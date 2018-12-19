package Chap8_Template;

/**
 * Created by Citrix on 2018-12-19.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        CaffeineWithHook coffee = new CaffeineWithHook();
        System.out.println("\nMaking coffee");
        coffee.prepareRecipe();
    }
}
