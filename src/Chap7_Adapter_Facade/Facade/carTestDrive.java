package Chap7_Adapter_Facade.Facade;

/**
 * Created by Citrix on 2018/12/10.
 */
public class carTestDrive {
    public static void main(String[] args) {
        Key key = new Key();
        Car car = new Car();
        car.start(key);
    }
}
