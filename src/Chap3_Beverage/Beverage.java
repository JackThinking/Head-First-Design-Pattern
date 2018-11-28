package Chap3_Beverage;

/**
 * Created by Citrix on 2018/11/28.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
