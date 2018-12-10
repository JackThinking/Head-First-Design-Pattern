package Chap7_Adapter_Facade.Facade;

/**
 * Created by Citrix on 2018/12/10.
 */
public class Car {
    Engine engine;

    public Car() {
    }

    public void start(Key key){
        Door door = new Door();
        boolean auth = key.turns();
        if (auth){
            engine.start();
            door.lock();
        }
    }
}
