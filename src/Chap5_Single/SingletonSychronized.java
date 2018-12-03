package Chap5_Single;

/**
 * Created by Citrix on 2018/12/3.
 */
public class SingletonSychronized {
    private static SingletonSychronized uniqueInstance;

    private SingletonSychronized() {
    }

    public static synchronized SingletonSychronized getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSychronized();
        }
        return uniqueInstance;
    }
}
