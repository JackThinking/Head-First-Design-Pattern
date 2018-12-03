package Chap5_Single;


/**
 * Created by Citrix on 2018/12/3.
 */
/*
* 单件模式的核心在于如何保证只有一个对象（同时考虑多线程）
* */
public class Singleton {
    /*
    * 私有静态引用表示是否已经生成了一个
    * */
    private static Singleton uniqueInstance;
    /*
    * 私有构造函数
    * */
    private Singleton() {
    }
    /*
    * 公开的获取对象的函数
    * */
    public Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
