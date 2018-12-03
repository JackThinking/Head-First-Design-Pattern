package Chap5_Single;

/**
 * Created by Citrix on 2018/12/3.
 */
public class SingletonVolitileSynchronized {
    private volatile static SingletonVolitileSynchronized uniqueInstance;

    private SingletonVolitileSynchronized() {
    }

    public static SingletonVolitileSynchronized getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (SingletonVolitileSynchronized.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonVolitileSynchronized();
                }
            }
        }
        return uniqueInstance;
    }
}
