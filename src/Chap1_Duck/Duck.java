package Chap1_Duck;

import com.sun.xml.internal.rngom.digested.DUnaryPattern;

/**
 * Created by Citrix on 2018/11/26.
 */
public abstract class Duck {
    /*
    * 抽象类中声明接口，不需要new和指名，继承duck的子类那么反过来不需要声明接口了，只能new对应实现接口的类
    * */
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }
    /*
    * 抽象方法，每个子类实现的时候都要根据自身情况进行修改
    * */
    public abstract void display();

    /*
    * 和接口相关的函数，由于接口本身的不确定性，这边的函数也没有加abstract（abstract不能有方法体）
    * */
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    /*
    * 策略模式的要点，可以修改接口的具体实现方法，而且神奇的是居然IDEA已经内置了相应的提醒
    * */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    /*
    * 父类中变化不大的“算法”，可以不标abstract，直接写死
    * */
    public void swim() {
        System.out.println("我会游泳");
    }
}
