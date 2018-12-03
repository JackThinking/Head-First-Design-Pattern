package Chap5_Single;

/**
 * Created by Citrix on 2018/12/3.
 */
public class SingletonEagerly {
    /*
    * 利用静态初始化器创建单件，保证线程安全
    * */
    private static SingletonEagerly uniqueInstance = new SingletonEagerly();

    private SingletonEagerly() {
    }

    public static SingletonEagerly getUniqueInstance() {
        return uniqueInstance;
    }
}
